package com.example.weatherforecast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val CITY: String = "Fullerton, CA"
    val API: String = "34d8cc8dab66bc691374d628684b5769"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}