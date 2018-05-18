package com.example.ivc17088adm.movieproject.webservice;

import java.util.Observable;

import retrofit2.http.GET;

public interface TmdbWebService {
   @GET("3/discover/movie?language=en&sort_by=popularity.desc")
    Observable<>
}
