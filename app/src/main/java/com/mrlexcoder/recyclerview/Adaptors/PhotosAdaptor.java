package com.mrlexcoder.recyclerview.Adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mrlexcoder.recyclerview.Models.PhotosModel;
import com.mrlexcoder.recyclerview.R;

import java.util.ArrayList;

public class PhotosAdaptor extends RecyclerView.Adapter<PhotosAdaptor.viewHolder>{

    ArrayList<PhotosModel> list;
    Context context;

    public PhotosAdaptor(ArrayList<PhotosModel> list, Context context) {
        this.list = list;
        this.context = context;
    }


    // methods

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview, parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        PhotosModel model = list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }


}
