package com.example.ivc17088adm.movieproject.webservice;

import com.example.ivc17088adm.movieproject.Video;

import java.util.List;
import java.util.Observable;

public interface MovieDetailsInteractor {
     Observable<List<Video>> getTrailers(String id);
}
