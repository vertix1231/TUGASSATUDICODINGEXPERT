package com.dicoding.expert.tugassatutopmovieversigw.POJO;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class PojoMovie extends ArrayList<Parcelable> implements Parcelable {
    private int ivmovie;
    private String tvdescmovie,tvjudul,tvrating;

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

    public String getTvrating() {
        return tvrating;
    }

    public void setTvrating(String tvrating) {
        this.tvrating = tvrating;
    }

    public PojoMovie() {
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.ivmovie);
        dest.writeString(this.tvdescmovie);
        dest.writeString(this.tvjudul);
        dest.writeString(this.tvrating);
    }

    protected PojoMovie(Parcel in) {
        this.ivmovie = in.readInt();
        this.tvdescmovie = in.readString();
        this.tvjudul = in.readString();
        this.tvrating = in.readString();
    }

    public static final Creator<PojoMovie> CREATOR = new Creator<PojoMovie>() {
        @Override
        public PojoMovie createFromParcel(Parcel source) {
            return new PojoMovie(source);
        }

        @Override
        public PojoMovie[] newArray(int size) {
            return new PojoMovie[size];
        }
    };
}
