package com.example.movies.Services

import com.example.movies.Endpoints.MovieEndpoint
import com.example.movies.Model.ApiResponse
import com.example.movies.Model.Movie
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieService {

    private val URL = "https://api.themoviedb.org/"
//    private val IMAGES_URL = "https://image.tmdb.org/t/p/original"

    val retrofit = Retrofit.Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}