package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create a string array for storing numbers
       /* String words[]=new String[10];
        words[0]="one";
        words[1]="two";
        words[2]="three";
        words[3]="four";
        words[4]="five";
        words[5]="six";
        words[6]="seven";
        words[7]="eight";
        words[8]="nine";
        words[9]="ten";*/
         // checking the value of the array using Log
        //Log.v("NumbersActivity","word at 0: "+words[0]);

        //Using ArrayList
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        // checking the value of the array using Log
        //Log.v("NumbersActivity","word at 0: "+words.get(1));

        // Finding root view of whole Layout
        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootview);


        int i;
        for(i=0;i<words.size();i++)
        {
            //creating new textview
            TextView wordView = new TextView(this);

            // Set the text to be word at index i
            wordView.setText(words.get(i));

           // Add this textView as another child of rootView
            rootView.addView(wordView);
        }
    }
}
