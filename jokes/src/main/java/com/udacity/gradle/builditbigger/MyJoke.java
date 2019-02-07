package com.udacity.gradle.builditbigger;

import java.util.Random;

public class MyJoke {
    private static final String[] joke_line = new String[]{
            "What do you call an Alligator in a vest?\n\n An Investigator!!",
            "Whats orange and sounds like parrot?\n\n A Carrot!",
            "What do you call a dog that does magic tricks?\n\n A Labradadrador",
            "How did the hipster burn his mouth?\n\n He ate pizza before its cool"
    };

    public String getMyJoke() {
        Random random = new Random();
        return joke_line[random.nextInt(joke_line.length)];
    }
}