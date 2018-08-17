package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        //Using ArrayList
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father", "әpә"));
        words.add(new Word("mother", "әṭa"));
        words.add(new Word("son", "angsi"));
        words.add(new Word("daughter", "tune"));
        words.add(new Word("older brother", "taachi"));
        words.add(new Word("younger brother", "chalitti"));
        words.add(new Word("older sister", "teṭe"));
        words.add(new Word("younger sister", "kolliti"));
        words.add(new Word("grandmother ", "ama"));
        words.add(new Word("grandfather", "paapa"));

        // Create an custom {@link WordAdapter} by extending ArrayAdapter, whose data source is a list of two strings. The
        // adapter knows how to create layouts for  each item in the list. using the
        WordAdapter itemsAdapter = new WordAdapter(this,words);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the WordAdapter we created above, so that the ListView
        // will display  list items for each word in the list of words.
        // Do this by calling the setAdapter method on the ListView object and pass in
        // 1 argument, which is the WordAdapter with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }
}
