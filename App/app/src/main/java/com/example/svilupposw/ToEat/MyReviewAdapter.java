package com.example.svilupposw.ToEat;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;
import java.util.List;


public class MyReviewAdapter extends BaseAdapter {

    private Context context;
    private ArrayList <Review> list;
    private String localId;


    public MyReviewAdapter(Context context, final String localId) {

        this.context = context;
        list = new ArrayList<>();
        this.localId = localId;

    }

    public void addItem (Review review) {

        if(this.localId.equals(review.getLocalId())) {
            list.add(review);
        }
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {

        return list.size();
    }

    @Override
    public Object getItem(int position) {

        return list.get(position);
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {

            convertView = LayoutInflater.from(context).inflate(R.layout.listview_review, parent, false);

        }

        TextView user = (TextView) convertView.findViewById(R.id.user);
        TextView comment = (TextView) convertView.findViewById(R.id.comment);
        RatingBar ratingBar = (RatingBar) convertView.findViewById(R.id.ratingBar);

        user.setText(((Review) getItem(position)).getUserName());
        comment.setText(((Review) getItem(position)).getComment());
        ratingBar.setRating(((Review) getItem(position)).getRating());

        return convertView;
    }
}
