package com.example.showjoke;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import com.udacity.gradle.builditbigger.MyJoke;

public class ShowJoke extends AppCompatActivity {
    private static final String KEY = "KEY";
    private TextView joke_textview;
    private String joke_string;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_joke);
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            joke_string = intent.getStringExtra(KEY);
            Log.i("KEY on showjoke", KEY);
        }
        MyJoke myjoke = new MyJoke();
        joke_textview = findViewById(R.id.text_joke);
//        joke_textview.setText(joke_string);
        joke_textview.setText(myjoke.getMyJoke());
    }
}

