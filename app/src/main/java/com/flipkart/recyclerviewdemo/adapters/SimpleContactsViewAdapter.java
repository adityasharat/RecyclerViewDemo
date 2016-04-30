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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_card_simple, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        TextView textViewContactName = (TextView) holder.itemView.findViewById(R.id.contact_name);
        TextView textViewContactNumber = (TextView) holder.itemView.findViewById(R.id.contact_number);
        TextView textViewContactEmail = (TextView) holder.itemView.findViewById(R.id.contact_email);

        Contact contact = contacts.get(position);
        if (textViewContactName != null) {
            textViewContactName.setText(contact.name);
            textViewContactNumber.setText(contact.number);
            textViewContactEmail.setText(contact.email);
        }
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        public ContactViewHolder(View itemView) {
            super(itemView);
        }
    }
}
