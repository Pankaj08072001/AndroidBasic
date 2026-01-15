package com.example.adaptorslearning.RecyclerViewDemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptorslearning.R;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.MyViewHolder1> {

    int[] arr_imgs;
    String[] arr_names;

    public MyAdapter2(int[] arr_imgs, String[] arr_names) {
        this.arr_imgs = arr_imgs;
        this.arr_names = arr_names;
    }

    @NonNull
    @Override
    public MyViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.singl_items, parent, false);
        return new MyViewHolder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter2.MyViewHolder1 holder, int position) {
        holder.img.setImageResource(arr_imgs[position]);
        holder.name.setText(arr_names[position]);
    }

    @Override
    public int getItemCount() {
        return arr_imgs.length;
    }

    class MyViewHolder1 extends RecyclerView.ViewHolder {

        private ImageView img;
        private TextView name;

        public MyViewHolder1(@NonNull View itemView) {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.img);
            name = (TextView) itemView.findViewById(R.id.txtName);
        }
    }
}
