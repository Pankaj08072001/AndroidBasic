//package com.example.adaptorslearing;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//
//public class MyAdaptorsOne extends BaseAdapter {
//    Context context;
//    int [] data;
//    LayoutInflater inflater;
//
//    public MyAdaptorsOne(Context context , int [] data){
//        this.context = context;
//        this.data = data;
//        inflater = LayoutInflater.from(context);
//    }
//
//    @Override
//    public int getCount() {
//        return data.length;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return data[position];
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View view, ViewGroup parent) {
//
//        if(view == null){ // important improvement
//            view = inflater.inflate(R.layout.ui_view_one , parent, false);
//        }
//
//        ImageView imageView = view.findViewById(R.id.image_one);
//        imageView.setImageResource(data[position]);
//
//        return view;
//    }
//}
