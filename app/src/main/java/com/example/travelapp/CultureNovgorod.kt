package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CultureNovgorod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_culture_novgorod)
    }

    fun buttonKreml_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 56.328263)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  44.003330)
        startActivity(routingIntent)
    }

    fun buttonAlexSad_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 56.329961)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  44.019039)
        startActivity(routingIntent)
    }

    fun buttonOAOGAZ_Click(view: View) {
        val routingIntent = Intent(this, RoutingActivity::class.java)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LAT, 56.255360)
        routingIntent.putExtra(RoutingActivity.DESTINATION_LONG,  43.894803)
        startActivity(routingIntent)
    }
}