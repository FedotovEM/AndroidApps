package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SportKolomna : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_kolomna)
    }

    fun buttonAerograd_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 55.092040)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  38.923590)
        startActivity(routingIntent)
    }

    fun buttonKosmopark_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 55.084903)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  38.774737)
        startActivity(routingIntent)
    }

    fun buttonKTsKolomna_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 55.106510)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  38.751669)
        startActivity(routingIntent)
    }
}