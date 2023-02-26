package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CultureKolomna : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_culture_kolomna)
    }

    fun buttonKreml_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 55.103129)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  38.752110)
        startActivity(routingIntent)
    }

    fun buttonPastila_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 55.104559)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  38.769841)
        startActivity(routingIntent)
    }

    fun buttonDomSamovara_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 55.104503)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  38.769434)
        startActivity(routingIntent)
    }
}