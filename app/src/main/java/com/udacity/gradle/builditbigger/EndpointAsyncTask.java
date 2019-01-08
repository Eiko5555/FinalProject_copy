package com.udacity.gradle.builditbigger;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import android.widget.Toast;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
//import  com.udacity.gradle.builditbigger.backend.myApi.Myapi;
import com.example.showjoke.ShowJoke;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;
import com.udacity.gradle.builditbigger.backend.myApi.model.MyBean;

import java.io.IOException;


public class EndpointAsyncTask extends AsyncTask<Pair<
        Context, String>, Void,String>{

    private static MyApi myApi = null;
    private Context context;
    private final String KEY = "KEY";

    @Override
    protected String doInBackground(Pair<Context, String>... pairs) {
        if (myApi == null){
            MyApi.Builder builder = new MyApi.Builder(
                    AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl("http://10.0.2.2:8080/_ah/api")
                    .setGoogleClientRequestInitializer(
                            new GoogleClientRequestInitializer() {
                                @Override
                                public void initialize(
                                        AbstractGoogleClientRequest<?> request)
                                        throws IOException {
                                    request.setDisableGZipContent(true);
                                }
                            }
                    );
            myApi = builder.build();
        }
        try {
            MyBean myBean = myApi.insertJoke().execute();
            return myBean.getData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
