package com.dicoding.expert.tugassatutopmovieversigw.ADAPTER;

import android.content.Context;
import android.content.Intent;
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
        View itemview = view;
        if(itemview == null) {
            itemview = LayoutInflater.from(context).inflate(R.layout.item_film, viewGroup, false);
        }
        ViewHolder viewHolder = new ViewHolder(itemview);
        PojoMovie pojoMovie = (PojoMovie) getItem(i);
        viewHolder.bind(pojoMovie);
        return itemview;

    }



    public class ViewHolder{

        private TextView judul,desc;
        private ImageView gambar;
        Button btnpilih;

        ViewHolder(View view){

            judul = view.findViewById(R.id.tvTitle);
            desc = view.findViewById(R.id.tvDesc);
            gambar = view.findViewById(R.id.ivImage);
            btnpilih = view.findViewById(R.id.btnPilih);

        }

        void bind (PojoMovie pojoMovie){

            judul.setText(pojoMovie.getTvjudul());
            desc.setText(pojoMovie.getTvdescmovie());
            gambar.setImageResource(pojoMovie.getIvmovie());
            btnpilih.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Intent intent = new Intent(Context.this,DetailActivity.class);
                    intent.putParcelableArrayListExtra(DetailActivity.EXTRA_MOVIE,pojoMovie);

                }
            });
        }


    }






}
