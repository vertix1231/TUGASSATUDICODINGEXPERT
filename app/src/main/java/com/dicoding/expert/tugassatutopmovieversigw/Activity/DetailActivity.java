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

    private TextView judul,desc;
    private ImageView gambar;
    public static final String EXTRA_MOVIE = "extra_movie";
    PojoMovie pojoMovie;
    String judulfilm,descfilm;
    int gambarfilm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setViewID();
        getDataFromMain();



//        judul = findViewById(R.id.tvTitle);
//        desc = findViewById(R.id.tvDesc);
//        gambar = findViewById(R.id.ivImage);
//
//        Bundle bundle =getIntent().getExtras();
//        if(bundle != null){
//            pojoMovie = bundle.getParcelable(EXTRA_MOVIE);
//
//        }
//
//        if(pojoMovie != null){
//            judul.setText(pojoMovie.getTvjudul());
//            desc.setText(pojoMovie.getTvdescmovie());
//            Glide.with(this).load(pojoMovie.getIvmovie()).into(gambar);
//        }

    }

    public void setViewID(){

        judul = findViewById(R.id.tvTitle);
        desc = findViewById(R.id.tvDesc);
        gambar = findViewById(R.id.ivImage);

    }

    public void getDataFromMain(){

        Bundle bundle = getIntent().getExtras();
        PojoMovie pojoMovie;

        if(bundle != null){
            pojoMovie = (PojoMovie) bundle.getParcelable(EXTRA_MOVIE);

            if(pojoMovie != null){
                setView(pojoMovie);
            }
        }

    }

    public void setView(PojoMovie pojoMovie){

        ArrayList<PojoMovie>pojoMovieArrayList = this.getIntent().getParcelableArrayListExtra(EXTRA_MOVIE);

        judulfilm = pojoMovie.getTvjudul();
        judul.setText(judulfilm);

        descfilm = pojoMovie.getTvdescmovie();
        desc.setText(descfilm);

        gambarfilm = pojoMovie.getIvmovie();
        gambar.setImageResource(gambarfilm);
        //Glide.with(this).load(pojoMovie.getIvmovie()).into(gambar);

    }


}
