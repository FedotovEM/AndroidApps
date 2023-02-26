package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yandex.mapkit.geometry.Point

class CultureRyazan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_culture_ryazan)
    }

    fun buttonRyazKreml_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 54.636682)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  39.748408)
        startActivity(routingIntent)
    }

    fun buttonVDV_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 54.633074)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  39.736300)
        startActivity(routingIntent)
    }

    fun buttonPozhalostin_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 54.627272)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  39.751208)
        startActivity(routingIntent)
    }
}