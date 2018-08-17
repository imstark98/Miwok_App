package com.example.android.miwok;

import android.app.Activity;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        /** Here, we initialize the ArrayAdapter's internal storage for the context and the list.
           the second argument is used when the ArrayAdapter is populating a single TextView.
           Because this is a custom adapter for two TextViews and one ImageView, the adapter is not
           going to use this second argument, so it can be any value. Here, we used 0.*/
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        /** Get the {@link Word} object located at this position in the list*/
        Word currentWord = getItem(position);

        /** Find the TextView in the list_item.xml layout with the ID miwok_text_view*/
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        /** Get the miwok translation from the current Word object and
            set this text on the miwok language TextView*/
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        /** Find the TextView in the list_item.xml layout with the ID default_text_view*/
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        /** Get the default translation from the current Word object and
            set this text on the default language TextView*/
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        /** Find the ImageView in the list_item.xml layout with the ID image*/
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        /** Get the image from the current Word object and
         set this image on the ImageView*/
        imageView.setImageResource(currentWord.getmImageResourceId());


        /** Return the whole list item layout (containing 2 TextViews)
         so that it can be shown in the ListView*/
        return listItemView;
    }
}
