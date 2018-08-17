package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        //Using ArrayList
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "weṭeṭṭi",R.drawable.color_red));
        words.add(new Word("mustard yellow", "chiwiiṭә",R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow", "ṭopiisә",R.drawable.color_dusty_yellow));
        words.add(new Word("green", "chokokki",R.drawable.color_green));
        words.add(new Word("brown", "ṭakaakki",R.drawable.color_brown));
        words.add(new Word("gray", "ṭopoppi",R.drawable.color_gray));
        words.add(new Word("black", "kululli",R.drawable.color_black));
        words.add(new Word("white", "kelelli",R.drawable.color_white));

        // Create an custom {@link WordAdapter} by extending ArrayAdapter, whose data source is a list of two strings. The
        // adapter knows how to create layouts for  each item in the list. using the
        WordAdapter itemsAdapter = new WordAdapter(this,words);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the WordAdapter we created above, so that the ListView
        // will display  list items for each word in the list of words.
        // Do this by calling the setAdapter method on the ListView object and pass in
        // 1 argument, which is the WordAdapter with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }
}
