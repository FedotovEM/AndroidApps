package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SportRyazan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_ryazan)
    }

    fun buttonKrutitsi_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 54.275945)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  40.817235)
        startActivity(routingIntent)
    }

    fun buttonATRON_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 54.588772)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  39.618649)
        startActivity(routingIntent)
    }

    fun buttonAdrenalin_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 54.695916)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  39.798045)
        startActivity(routingIntent)
    }
}