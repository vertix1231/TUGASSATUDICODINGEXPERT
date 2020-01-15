package com.dicoding.expert.tugassatutopmovieversigw.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.expert.tugassatutopmovieversigw.POJO.PojoMovie;
import com.dicoding.expert.tugassatutopmovieversigw.R;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private TextView tvjudul,tvdesc,tvrating;
    private ImageView ivgambar;

    String judul,desc,rating;
    int Gambar;

    public static final String EXTRA_MOVIE = "extra_movie";
    PojoMovie pojoMovie;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvjudul = findViewById(R.id.tvTitle);
        tvdesc = findViewById(R.id.tvDesc);
        ivgambar = findViewById(R.id.ivImage);
        tvrating = findViewById(R.id.tvRating);

        ArrayList<PojoMovie> pojoMovieArrayList =this.getIntent().getParcelableArrayListExtra(EXTRA_MOVIE);

        judul = pojoMovieArrayList.get(0).getTvjudul();
        tvjudul.setText(judul);

        desc = pojoMovieArrayList.get(0).getTvdescmovie();
        tvdesc.setText(desc);

        Gambar = pojoMovieArrayList.get(0).getIvmovie();
        ivgambar.setImageResource(Gambar);

        rating = pojoMovieArrayList.get(0).getTvrating();
        tvrating.setText(rating);




    }



}
