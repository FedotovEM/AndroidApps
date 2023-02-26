package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yandex.mapkit.Animation
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.mapview.MapView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MapKitFactory.setApiKey("c21953b0-c26b-4ddd-8db1-98955daa7eb9")
    }
    /*
    lateinit var mapView: MapView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.setApiKey("c21953b0-c26b-4ddd-8db1-98955daa7eb9")
        MapKitFactory.initialize(this)
        setContentView(R.layout.activity_main)
        mapView = findViewById(R.id.mapview)
        mapView.map.move(CameraPosition(Point(54.613254, 39.722577), 16.0f,
            0.0f, 0.0f), Animation(Animation.Type.SMOOTH, 10f), null)
    }

    override fun onStop() {
        mapView.onStop()
        MapKitFactory.getInstance().onStop()
        super.onStop()
    }

    override fun onStart() {
        mapView.onStart()
        MapKitFactory.getInstance().onStart()
        super.onStart()
    }

     */

    fun ryazanSec(view: View){
        val ryazanIntent = Intent(this, SecondActivity::class.java)
        ryazanIntent.putExtra(SecondActivity.CITY, "Ryazan")
        startActivity(ryazanIntent)
    }

    fun kolomnaSec(view: View){
        val kolomnaIntent = Intent(this, SecondActivity::class.java)
        kolomnaIntent.putExtra(SecondActivity.CITY, "Kolomna")
        startActivity(kolomnaIntent)
    }

    fun novgorodSec(view: View){
        val novgorodIntent = Intent(this, SecondActivity::class.java)
        novgorodIntent.putExtra(SecondActivity.CITY, "Nizhni Novgorod")
        startActivity(novgorodIntent)
    }
}