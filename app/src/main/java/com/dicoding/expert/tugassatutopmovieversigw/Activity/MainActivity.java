package com.dicoding.expert.tugassatutopmovieversigw.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.dicoding.expert.tugassatutopmovieversigw.ADAPTER.AdapterMovie;
import com.dicoding.expert.tugassatutopmovieversigw.POJO.PojoMovie;
import com.dicoding.expert.tugassatutopmovieversigw.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    //listview
    ListView listView;

    //adapter
    private AdapterMovie adapterMovie;

    //data array judul dan deaac
    private String[] namadata, Descriptiondata,ratingdata;


    //data array gambar fil
    private TypedArray Photodata;

    //Arraylist tempat menampung array2
    private ArrayList<PojoMovie> pojoMovieArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapterMovie = new AdapterMovie(this);
        listView =findViewById(R.id.lv_list);
        listView.setAdapter(adapterMovie);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this,DetailActivity.class);

                ArrayList<PojoMovie> pojoMovieArrayList = new ArrayList<PojoMovie>();
                PojoMovie pojoMovie = new PojoMovie();

                pojoMovie.setTvjudul(namadata[i]);
                pojoMovie.setTvdescmovie(Descriptiondata[i]);
                pojoMovie.setIvmovie(Photodata.getResourceId(i,-1));
                pojoMovie.setTvrating(ratingdata[i]);

                pojoMovieArrayList.add(pojoMovie);

                intent.putParcelableArrayListExtra(DetailActivity.EXTRA_MOVIE,pojoMovieArrayList);
                startActivity(intent);


            }
        });




    }



    private void addItem(){
        pojoMovieArrayList = new ArrayList<>();

        for (int i = 0; i < namadata.length; i++) {

            PojoMovie pojoMovie = new PojoMovie();
            pojoMovie.setIvmovie(Photodata.getResourceId(i,-1));
            pojoMovie.setTvjudul(namadata[i]);
            pojoMovie.setTvdescmovie(Descriptiondata[i]);
            pojoMovie.setTvrating(ratingdata[i]);
            pojoMovieArrayList.add(pojoMovie);

        }

        adapterMovie.setArrayList(pojoMovieArrayList);
    }

    private void prepare(){
        namadata = getResources().getStringArray(R.array.data_title);
        Descriptiondata = getResources().getStringArray(R.array.data_desc);
        Photodata = getResources().obtainTypedArray(R.array.data_image);
        ratingdata = getResources().getStringArray(R.array.data_rating);

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
