package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SportNovgorod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_novgorod)
    }

    fun buttonRockTrail_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 56.319095)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  43.919112)
        startActivity(routingIntent)
    }

    fun buttonAkademia_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 56.341979)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  43.859533)
        startActivity(routingIntent)
    }

    fun buttonPartizan_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 56.308115)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  43.715401)
        startActivity(routingIntent)
    }
}