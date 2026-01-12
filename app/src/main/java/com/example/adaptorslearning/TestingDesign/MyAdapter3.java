package com.example.adaptorslearning.TestingDesign;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptorslearning.R;

public class MyAdapter3 extends RecyclerView.Adapter<MyAdapter3.MyViewHolder2> {

    String[] arr_names;

    public MyAdapter3(String[] arr_names) {
        this.arr_names = arr_names;
    }

    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_items3, parent, false);
        return new MyViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
        holder.name.setText(arr_names[position]);
    }

    @Override
    public int getItemCount() {
        return arr_names.length;
    }

    static class MyViewHolder2 extends RecyclerView.ViewHolder {
        TextView name;

        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textView);
        }
    }
}
