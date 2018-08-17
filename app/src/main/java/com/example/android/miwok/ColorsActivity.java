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

        words.add(new Word("red", "weṭeṭṭi"));
        words.add(new Word("mustard yellow", "chiwiiṭә"));
        words.add(new Word("dusty yellow", "ṭopiisә"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("brown", "ṭakaakki"));
        words.add(new Word("gray", "ṭopoppi"));
        words.add(new Word("black", "kululli"));
        words.add(new Word("white", "kelelli"));

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
