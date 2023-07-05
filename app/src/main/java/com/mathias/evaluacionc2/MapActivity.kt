package com.mathias.evaluacionc2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.mathias.evaluacionc2.databinding.ActivityMapBinding

class MapActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var binding: ActivityMapBinding
    private lateinit var googleMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fragmentMap = supportFragmentManager.findFragmentById(R.id.fcv_map) as SupportMapFragment
        fragmentMap.getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap) {
        googleMap = map
        val tamboIzaguirre = LatLng(-11.988079082149497, -77.06769168496716)
        val tamboOlivosSMP = LatLng(-11.986148023037535, -77.08442866869215)
        val tamboMayolo = LatLng(-11.993872176559394, -77.0854586369214)

        googleMap.addMarker(MarkerOptions().position(tamboIzaguirre).title("TAMBO IZAGUIRRE"))
        googleMap.addMarker(MarkerOptions().position(tamboOlivosSMP).title("TAMBO OLIVOS"))
        googleMap.addMarker(MarkerOptions().position(tamboMayolo).title("TAMBO MAYOLO"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tamboIzaguirre,13f))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tamboOlivosSMP,13f))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tamboMayolo,13f))
    }
}