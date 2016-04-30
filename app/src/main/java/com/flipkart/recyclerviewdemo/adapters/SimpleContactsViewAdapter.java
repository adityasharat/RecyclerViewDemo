package com.flipkart.recyclerviewdemo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.flipkart.recyclerviewdemo.R;
import com.flipkart.recyclerviewdemo.models.Contact;

import java.util.List;

/**
 * SimpleContactsViewAdapter
 *
 * @author aditya.sharat
 */
public class SimpleContactsViewAdapter extends RecyclerView.Adapter<SimpleContactsViewAdapter.ContactViewHolder> {

    private final List<Contact> contacts;

    public SimpleContactsViewAdapter(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =
        return null;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        public ContactViewHolder(View itemView) {
            super(itemView);
        }
    }
}
