package com.mathias.evaluacionc2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.mathias.evaluacionc2.databinding.FragmentMapBinding


class MapFragment : Fragment() {

    private var _binding: FragmentMapBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       _binding =  FragmentMapBinding.inflate(inflater, container, false)

        binding.btnAddAddress.setOnClickListener {
            val intent = Intent(requireActivity(), MapActivity::class.java)
            startActivity(intent)
            //openGoogleMaps()
        }
        return binding.root
    }
}