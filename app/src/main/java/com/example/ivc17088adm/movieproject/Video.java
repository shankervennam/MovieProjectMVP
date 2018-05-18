package com.example.ivc17088adm.movieproject;

import android.os.Parcel;
import android.os.Parcelable;

public class Video implements Parcelable {
    protected Video(Parcel in) {
    }

    public static final Creator<Video> CREATOR = new Creator<Video>() {
        @Override
        public Video createFromParcel(Parcel in) {
            return new Video(in);
        }

        @Override
        public Video[] newArray(int size) {
            return new Video[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
