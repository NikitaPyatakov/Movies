package com.bignerdranch.movies;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class FavouriteMoviesViewModel extends AndroidViewModel {

    private final MovieDao movieDao;

    public FavouriteMoviesViewModel(@NonNull Application application) {
        super(application);
        movieDao = MovieDataBase.getInstance(getApplication()).movieDao();
    }

    public LiveData<List<Movie>> getFavouriteMovies() {
        return movieDao.getAllFavouriteMovies();
    }
}
