package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.showjoke.ShowJoke;

public class MainActivity extends AppCompatActivity {
    Context context;
    public static final String JOKING = "JOKE";;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        //getJoke
//        Toast.makeText(this, "getJokes", Toast.LENGTH_SHORT).show();
//
//        String JOKE_LINE = "JOKE";
//        Intent intent = new Intent(context, ShowJoke.class);
//        //intent.putExtra(JOKE_LINE, String result);
//        context.startActivity(intent);
//        new EndpointAsyncTask().execute(new Pair<Context, String>(
//                this, "placeholder"));
    }




}