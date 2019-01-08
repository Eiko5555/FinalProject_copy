package com.udacity.gradle.builditbigger;

import java.util.Random;

public class  MyJoke {

//    private int position;

    //        public JokeBank(){
//    joke_line = new String[]{
//        "What do you call an Alligator in a vest? An Investigator!!",
//                "Whats orange and sounds like parrot? A Carrot!",
//                "What do you call a dog that does magic tricks? A Labradadrador",
//                "How did the hipster burn his mouth? He ate pizza before its cool"
//    };
    private static final String[] joke_line = new String[]{
            "What do you call an Alligator in a vest? An Investigator!!",
            "Whats orange and sounds like parrot? A Carrot!",
            "What do you call a dog that does magic tricks? A Labradadrador",
            "How did the hipster burn his mouth? He ate pizza before its cool"
    };
    //            position = joke_line.length;
//        }
    public String getJoke(){
//            int random = new Random().nextInt(position);
//            return joke_line[random];
        Random random = new Random();
        return joke_line[random.nextInt(joke_line.length)];
    }
}