package com.example.agenda;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
    private List<Contact> contacts;

    public ContactAdapter(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact = contacts.get(position);
        holder.tvNombre.setText(contact.getNombre());
        holder.ivPerfil.setImageBitmap(contact.getImg());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombre,tvEmail,tvTel;
        ImageView ivPerfil;

        ViewHolder(View view) {
            super(view);
            tvNombre = (TextView) view.findViewById(R.id.textViewNombre);
            tvEmail = (TextView) view.findViewById(R.id.textViewEmail);
            tvTel = (TextView) view.findViewById(R.id.textViewTel);
            ivPerfil = (ImageView) view.findViewById(R.id.imageViewPerfil);
        }
    }
}
