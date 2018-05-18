package com.example.ivc17088adm.movieproject.webservice;

public class MovieDetailsInteractorImpl implements MovieDetailsInteractor {

    private TmdbWebService tmdbWebService;

    MovieDetailsInteractorImpl(TmdbWebService tmdbWebService) {
      this.tmdbWebService = tmdbWebService;
    }



}
