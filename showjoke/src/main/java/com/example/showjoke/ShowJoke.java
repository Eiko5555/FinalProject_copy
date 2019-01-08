package com.example.showjoke;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ShowJoke extends AppCompatActivity{
    private TextView joke_textview;
    private static final String JOKING = "JOKE";
    private String joke_string;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_joke);
        Intent intent = getIntent();
        if (intent.getExtras() != null){
            joke_string = intent.getStringExtra(JOKING);
        }
        joke_textview = findViewById(R.id.text_joke);
        joke_textview.setText(joke_string);
    }

//    private String getJokelist() {
//        Intent intent = getIntent();
//        String funny_line = null;
//        if (intent.getExtras() != null){
//            funny_line = intent.getStringExtra(JOKE);
//        }
//        return
//    }
}

