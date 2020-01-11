package com.dicoding.expert.tugassatutopmovieversigw.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.dicoding.expert.tugassatutopmovieversigw.POJO.PojoMovie;
import com.dicoding.expert.tugassatutopmovieversigw.R;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private TextView judul,desc;
    private ImageView gambar;
    public static final String EXTRA_MOVIE = "extra_movie";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        judul = findViewById(R.id.tvTitle);
        desc = findViewById(R.id.tvDesc);
        gambar = findViewById(R.id.ivImage);

        //ArrayList<PojoMovie> pojoMovies = getIntent().getParcelableArrayListExtra(EXTRA_MOVIE);

    }
}
