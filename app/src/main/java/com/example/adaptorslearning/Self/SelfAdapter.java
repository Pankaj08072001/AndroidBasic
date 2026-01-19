package com.example.adaptorslearning.Self;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptorslearning.R;

public class SelfAdapter extends RecyclerView.Adapter<SelfAdapter.MyViewHolder> {

    int [] arr_imgs;

    public SelfAdapter(int [] arr_imgs){
        this.arr_imgs = arr_imgs;
    }

    @NonNull
    @Override
    public SelfAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.test, parent, false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull SelfAdapter.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(arr_imgs[position]);
    }

    @Override
    public int getItemCount() {
        return arr_imgs.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

      private ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
