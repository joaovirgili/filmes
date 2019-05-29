package com.example.movies.Endpoints

import com.example.movies.Model.ApiResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieEndpoint {
    @GET("3/movie/popular?api_key=7dea85f8ef481e365eb3fea2195e46a1&language=pt-BR&page=1")
    fun getMovies(): Call<ApiResponse>
}