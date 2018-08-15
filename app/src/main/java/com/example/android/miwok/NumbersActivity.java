package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        //Using ArrayList
        ArrayList<Word> words = new ArrayList<Word>();

        //words.add("one")
        //Word w = new Word("one","lutti");
        //words.add(w);

        //words.add(new Word("one","lutti"));

        words.add(new Word("one","lutti"));
        words.add(new Word("two","otiiko"));
        words.add(new Word("three","tolookosu"));
        words.add(new Word("four","oyyisa"));
        words.add(new Word("five","massokka"));
        words.add(new Word("six","temmokka"));
        words.add(new Word("seven","kenekaku"));
        words.add(new Word("eight","kawinta"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'aacha"));

        // Create an custom {@link WordAdapter} by extending ArrayAdapter, whose data source is a list of two strings. The
        // adapter knows how to create layouts for  each item in the list. using the
        WordAdapter itemsAdapter = new WordAdapter(this,words);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the WordAdapter we created above, so that the ListView
        // will display  list items for each word in the list of words.
        // Do this by calling the setAdapter method on the ListView object and pass in
        // 1 argument, which is the WordAdapter with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }
}
