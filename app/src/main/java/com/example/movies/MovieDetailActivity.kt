package com.example.movies

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_detail.*

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_detail)

        //actionbar
        val actionbar = supportActionBar

        val movie_title :String = intent.getStringExtra("title")
        val movie_overview :String = intent.getStringExtra("overview")
        val movie_poster_path :String = intent.getStringExtra("poster_path")

        actionbar!!.title = movie_title
        actionbar.setDisplayHomeAsUpEnabled(true)

        txt_overview.text = movie_overview
        Picasso.get().load("https://image.tmdb.org/t/p/original$movie_poster_path").into(image_poster)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
