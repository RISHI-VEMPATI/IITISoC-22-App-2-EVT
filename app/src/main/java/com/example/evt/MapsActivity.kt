package com.example.evt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.evt.databinding.ActivityMapsBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback  {

    private lateinit var mMap: GoogleMap

    private lateinit var binding: ActivityMapsBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)




    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val ev1 = LatLng(22.528069, 75.925103)
        mMap.addMarker(MarkerOptions().position(ev1).snippet("EV1"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ev1))

        val ev2 = LatLng(22.529697, 75.923656)
        mMap.addMarker(MarkerOptions().position(ev2).title("EV2"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ev2))

        val ev3 = LatLng(22.530636, 75.922933)
        mMap.addMarker(MarkerOptions().position(ev3).title("EV3"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ev3))

        val ev4 = LatLng(22.52855, 75.922775)
        mMap.addMarker(MarkerOptions().position(ev4).title("EV4"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ev4))

        val ev5 = LatLng(22.526256, 75.921167)
        mMap.addMarker(MarkerOptions().position(ev5).title("EV5"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ev5))

        val ev6 = LatLng(22.522364, 75.921625)
        mMap.addMarker(MarkerOptions().position(ev6).title("EV6"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ev6))

        val ev7 = LatLng(22.520281, 75.921636)
        mMap.addMarker(MarkerOptions().position(ev7).title("EV7"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ev7))

        val ev8 = LatLng(22.520156, 75.921856)
        mMap.addMarker(MarkerOptions().position(ev8).title("EV8"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ev8))

        val ev10 = LatLng(22.522872, 75.925636)
        mMap.addMarker(MarkerOptions().position(ev10).title("EV10"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ev10))

        val gate1 = LatLng(22.528389, 75.917575)
        mMap.addMarker(MarkerOptions().position(gate1).title("GATE1"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gate1))


    }
}