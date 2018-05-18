package com.example.ivc17088adm.movieproject.details;

import com.example.ivc17088adm.movieproject.webservice.MovieDetailsInteractor;
import com.example.ivc17088adm.movieproject.webservice.MovieDetailsInteractorImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class DetailsModule {
    @Provides
    MovieDetailsInteractor provideInteractor(TmdbWebService tmdbWebService) {
        return new MovieDetailsInteractorImpl(tmdbWebService);
    }
}
