package com.dicoding.expert.tugassatutopmovieversigw.ADAPTER;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dicoding.expert.tugassatutopmovieversigw.Activity.DetailActivity;
import com.dicoding.expert.tugassatutopmovieversigw.Activity.MainActivity;
import com.dicoding.expert.tugassatutopmovieversigw.POJO.PojoMovie;
import com.dicoding.expert.tugassatutopmovieversigw.R;

import java.util.ArrayList;

public class AdapterMovie extends BaseAdapter {

    private Context context;
    private ArrayList<PojoMovie> moviearray = new ArrayList<>();


    public void setArrayList(ArrayList<PojoMovie> arrayList) {
        this.moviearray = arrayList;
    }

    public AdapterMovie(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return moviearray.size();
    }

    @Override
    public Object getItem(int i) {
        return moviearray.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }



    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View itemView = view;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_film, viewGroup, false);
        }
        ViewHolder viewHolder = new ViewHolder(itemView);
        PojoMovie movie = (PojoMovie) getItem(i);
        viewHolder.bind(movie);
        return itemView;
    }



    public class ViewHolder{

        private TextView judul,desc,rating;
        private ImageView gambar;


        ViewHolder(View view){


            judul = view.findViewById(R.id.tvTitle);
            desc = view.findViewById(R.id.tvDesc);
            rating = view.findViewById(R.id.tvRating);
            gambar = view.findViewById(R.id.ivImage);


//            btnpilih = view.findViewById(R.id.btnPilih);

        }

        void bind ( PojoMovie pojoMovie){

            judul.setText(pojoMovie.getTvjudul());
            desc.setText(pojoMovie.getTvdescmovie());
            rating.setText(pojoMovie.getTvrating());
            gambar.setImageResource(pojoMovie.getIvmovie());


        }


    }






}
