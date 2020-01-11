package com.dicoding.expert.tugassatutopmovieversigw.POJO;

import android.os.Parcel;
import android.os.Parcelable;

public class PojoMovie implements Parcelable {
    private int ivmovie;
    private String tvdescmovie,tvjudul;


    protected PojoMovie(Parcel in) {
        ivmovie = in.readInt();
        tvdescmovie = in.readString();
        tvjudul = in.readString();
    }

    public static final Creator<PojoMovie> CREATOR = new Creator<PojoMovie>() {
        @Override
        public PojoMovie createFromParcel(Parcel in) {
            return new PojoMovie(in);
        }

        @Override
        public PojoMovie[] newArray(int size) {
            return new PojoMovie[size];
        }
    };

    public int getIvmovie() {
        return ivmovie;
    }

    public void setIvmovie(int ivmovie) {
        this.ivmovie = ivmovie;
    }

    public String getTvdescmovie() {
        return tvdescmovie;
    }

    public void setTvdescmovie(String tvdescmovie) {
        this.tvdescmovie = tvdescmovie;
    }

    public String getTvjudul() {
        return tvjudul;
    }

    public void setTvjudul(String tvjudul) {
        this.tvjudul = tvjudul;
    }

    public PojoMovie() {
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ivmovie);
        parcel.writeString(tvdescmovie);
        parcel.writeString(tvjudul);
    }
}
