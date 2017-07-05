package com.example.android.quakereport.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.quakereport.Models.Book;
import com.example.android.quakereport.R;

import java.util.ArrayList;

/**
 * Created by l4z on 05.07.2017.
 */

public class Adapters {
    public static class BookAdapter extends ArrayAdapter<Book> {


        public BookAdapter(Activity context, ArrayList<Book> designClassAdapters) {
            // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
            // the second argument is used when the ArrayAdapter is populating a single TextView.
            // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
            // going to use this second argument, so it can be any value. Here, we used 0.
            super(context, 0, designClassAdapters);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.moj_layout, parent, false);
            }
            Book currentItem = getItem(position);
            String authorName = "by" + currentItem.getAuthor();
            String title = currentItem.getTitle();
            TextView contactView1 = (TextView) listItemView.findViewById(R.id.author);
            contactView1.setText(authorName);
            TextView contactView2 = (TextView) listItemView.findViewById(R.id.title);
            contactView2.setText(title);

            return listItemView;
        }
    }
}
