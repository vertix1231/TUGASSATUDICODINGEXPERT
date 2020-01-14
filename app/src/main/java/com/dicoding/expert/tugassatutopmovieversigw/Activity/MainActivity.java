package com.dicoding.expert.tugassatutopmovieversigw.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.dicoding.expert.tugassatutopmovieversigw.ADAPTER.AdapterMovie;
import com.dicoding.expert.tugassatutopmovieversigw.POJO.PojoMovie;
import com.dicoding.expert.tugassatutopmovieversigw.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    ListView listView;
    private AdapterMovie adapterMovie;
    private LinearLayout llitemfilm;

    private String[] namadata;
    private String[] Descriptiondata;
    private TypedArray Photodata;
    private ArrayList<PojoMovie> pojoMovieArrayList;

    Button btnpilih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        btnpilih = findViewById(R.id.btnPilih);
//        btnpilih.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ArrayList<PojoMovie> pojoMovie = new ArrayList<>();
//                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
//                intent.putParcelableArrayListExtra(DetailActivity.EXTRA_MOVIE,pojoMovie);
//            }
//        });
        listView =findViewById(R.id.lv_list);
//        llitemfilm = findViewById(R.id.llDesc);
//        llitemfilm.setOnClickListener(this);
        adapterMovie = new AdapterMovie(this);
        listView.setAdapter(adapterMovie);

        prepare();
        addItem();




    }



    private void addItem(){
        pojoMovieArrayList = new ArrayList<>();

        for (int i = 0; i < namadata.length; i++) {

            PojoMovie pojoMovie = new PojoMovie();
            pojoMovie.setIvmovie(Photodata.getResourceId(i,-1));
            pojoMovie.setTvjudul(namadata[i]);
            pojoMovie.setTvdescmovie(Descriptiondata[i]);
            pojoMovieArrayList.add(pojoMovie);

        }

        adapterMovie.setArrayList(pojoMovieArrayList);
    }

    private void prepare(){
        namadata = getResources().getStringArray(R.array.data_title);
        Descriptiondata = getResources().getStringArray(R.array.data_desc);
        Photodata = getResources().obtainTypedArray(R.array.data_image);

    }



//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.llDesc:
//                ArrayList<PojoMovie> pojoMovie = new ArrayList<>();
//                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
//                intent.putParcelableArrayListExtra(DetailActivity.EXTRA_MOVIE,pojoMovie);
//                startActivity(intent);
//                break;
//        }
//
//
//    }
}
