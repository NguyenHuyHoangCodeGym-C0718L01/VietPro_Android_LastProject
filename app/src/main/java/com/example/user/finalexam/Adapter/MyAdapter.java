package com.example.user.finalexam.Adapter;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.finalexam.Fragment.MapsActivity;
import com.example.user.finalexam.Object.City;
import com.example.user.finalexam.Object.Event;
import com.example.user.finalexam.Object.Info;
import com.example.user.finalexam.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 1/20/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private List<Info>listInfo;
    public MyAdapter(List<Info>listInfo){
        this.listInfo=listInfo;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Info info = listInfo.get(position);
        Picasso.with(holder.imgImage.getContext()).load(info.getImage()).into(holder.imgImage);
        holder.txtName.setText(info.getName());
        holder.txtPrice.setText(info.getPrice());
        holder.txtRestaurant.setText(info.getRestaurant());
        holder.txtAddress.setText(info.getAddress());
        holder.txtAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                android.app.FragmentManager fragmentManager = ((Activity)view.getContext()).getFragmentManager();

            }
        });
    }

    @Override
    public int getItemCount() {
        return listInfo.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgImage;
        TextView txtName, txtPrice, txtRestaurant, txtAddress;
//        Button btnMoreInfo;

        public ViewHolder(View itemView){
            super(itemView);
//            btnMoreInfo=(Button)itemView.findViewById(R.id.btn_more_info);
            imgImage=(ImageView)itemView.findViewById(R.id.img_image);
            txtName=(TextView) itemView.findViewById(R.id.txt_name);
            txtPrice=(TextView)itemView.findViewById(R.id.txt_price);
            txtRestaurant=(TextView)itemView.findViewById(R.id.txt_restaurant);
            txtAddress=(TextView)itemView.findViewById(R.id.txt_address);
        }
    }
}
