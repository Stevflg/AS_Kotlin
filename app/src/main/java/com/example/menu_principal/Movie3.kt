package com.example.menu_principal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Movie3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie3)
    }
    fun returnmainmenu(view: View){
        val returns= Intent(this, Peliculas_Favoritas::class.java)
        startActivity(returns)
    }
}