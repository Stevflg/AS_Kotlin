package com.example.menu_principal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class Peliculas_Favoritas: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peliculas_favoritas)

    }
    fun returnMenu(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun movie1(view: View) {
        val intent = Intent(this, Movie1::class.java)
        startActivity(intent)
    }
    fun movie2(view: View) {
        val intent = Intent(this, Movie2::class.java)
        startActivity(intent)
    }
    fun movie3(view: View) {
        val intent = Intent(this, Movie3::class.java)
        startActivity(intent)
    }
    fun movie4(view: View) {
        val intent = Intent(this, Movie4::class.java)
        startActivity(intent)
    }
}