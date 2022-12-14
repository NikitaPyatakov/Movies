package com.bignerdranch.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("movie?token=E0FSHZ2-50C4VQK-KKZGEKJ-1QBSX5B&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie?token=E0FSHZ2-50C4VQK-KKZGEKJ-1QBSX5B&field=id")
    Single<TrailerResponse> loadTrailers(@Query("search") int id);

    @GET("review?token=E0FSHZ2-50C4VQK-KKZGEKJ-1QBSX5B&field=movieId")
    Single<ReviewResponse> loadReviews(@Query("search") int id);
}
