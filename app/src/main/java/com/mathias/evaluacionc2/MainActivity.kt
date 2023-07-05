package com.mathias.evaluacionc2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.mathias.evaluacionc2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragments(MapFragment())

        binding.bnv1.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.btn_mapa -> replaceFragments(MapFragment())
                R.id.btn_camara -> replaceFragments(CamaraFragment())
                R.id.btn_info -> replaceFragments(InfoFragment())

                else->{

            }
        }
            true
        }


    }


    private fun replaceFragments(fragment:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.flayout,fragment)
        fragmentTransaction.commit()
    }
}