package com.example.travelapp

import android.Manifest
import android.content.pm.PackageManager
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.yandex.mapkit.*
import com.yandex.mapkit.directions.DirectionsFactory
import com.yandex.mapkit.directions.driving.DrivingOptions
import com.yandex.mapkit.directions.driving.DrivingRoute
import com.yandex.mapkit.directions.driving.DrivingRouter
import com.yandex.mapkit.directions.driving.DrivingSession
import com.yandex.mapkit.directions.driving.DrivingSession.*
import com.yandex.mapkit.directions.driving.VehicleOptions
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.map.MapObjectCollection
import com.yandex.mapkit.mapview.MapView
import com.yandex.mapkit.user_location.UserLocationLayer
import com.yandex.runtime.Error

class RoutingActivity : AppCompatActivity(), DrivingRouteListener {
    lateinit var mapView: MapView
    lateinit var ROUTE_END_LOCATION: Point
    lateinit var ROUTE_START_LOCATION: Point
    lateinit var locationmapkit: UserLocationLayer
    lateinit var fusedLocationClient: FusedLocationProviderClient

    private var mapObjects: MapObjectCollection? = null
    private var drivingRouter: DrivingRouter? = null
    private var drivingSession: DrivingSession? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_routing)

        val mapKit: MapKit = MapKitFactory.getInstance()
        mapView = findViewById(R.id.mapview)

        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION),0)
            return
        }

        ROUTE_END_LOCATION = Point(intent.getDoubleExtra(DESTINATION_LAT, 0.0),
            intent.getDoubleExtra(DESTINATION_LONG, 0.0))
        ROUTE_START_LOCATION = Point(54.613254, 39.722577)

        locationmapkit = mapKit.createUserLocationLayer(mapView.mapWindow)
        locationmapkit.isVisible = true

        drivingRouter = DirectionsFactory.getInstance().createDrivingRouter()
        mapObjects = mapView.map.mapObjects.addCollection()
        mapObjects!!.addPlacemark(ROUTE_END_LOCATION)

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        fusedLocationClient.lastLocation
            .addOnSuccessListener { location: Location? ->
                if (location != null) {
                    ROUTE_START_LOCATION = Point(location.latitude, location.longitude)
                }
            }

        val requestPoints: ArrayList<RequestPoint> = ArrayList()
        requestPoints.add(RequestPoint(ROUTE_START_LOCATION, RequestPointType.WAYPOINT, null))
        requestPoints.add(RequestPoint(ROUTE_END_LOCATION, RequestPointType.WAYPOINT, null))

        drivingSession = drivingRouter!!.requestRoutes(requestPoints, DrivingOptions(), VehicleOptions(), this)

        mapView.map.move(CameraPosition(ROUTE_START_LOCATION, 16.0f, 0.0f, 0.0f),
            Animation(Animation.Type.SMOOTH, 2f), null)
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


    override fun onDrivingRoutes(p0: MutableList<DrivingRoute>) {
        for(route in p0) {
            mapObjects!!.addPolyline(route.geometry)
        }
    }

    override fun onDrivingRoutesError(p0: Error) {
        Toast.makeText(this, p0.toString(),Toast.LENGTH_SHORT).show()
    }


    companion object{
        val DESTINATION_LAT = "Destination_lat"
        val DESTINATION_LONG = "Destination_long"
    }
}