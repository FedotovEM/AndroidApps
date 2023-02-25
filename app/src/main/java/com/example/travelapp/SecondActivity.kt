package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun buttonClickCulture(view: View){
        val city = intent.getStringExtra(CITY)
        when(city){
            "Ryazan" -> {
                val cultureIntent = Intent(this, CultureRyazan::class.java)
                startActivity(cultureIntent)
            }
            "Kolomna" -> {
                val cultureIntent = Intent(this, CultureKolomna::class.java)
                startActivity(cultureIntent)
            }
            "Nizhni Novgorod" -> {
                val cultureIntent = Intent(this, CultureNovgorod::class.java)
                startActivity(cultureIntent)
            }
        }
    }

    fun buttonClickSport(view: View){
        val city = intent.getStringExtra(CITY)
        when(city){
            "Ryazan" -> {
                val sportIntent = Intent(this, SportRyazan::class.java)
                startActivity(sportIntent)
            }
            "Kolomna" -> {
                val sportIntent = Intent(this, SportKolomna::class.java)
                startActivity(sportIntent)
            }
            "Nizhni Novgorod" -> {
                val sportIntent = Intent(this, SportNovgorod::class.java)
                startActivity(sportIntent)
            }
        }
    }

    companion object{
        val CITY = "default_city"
    }
}