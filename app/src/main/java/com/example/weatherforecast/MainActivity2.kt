package com.example.weatherforecast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val editText1 = findViewById<EditText>(R.id.editText1)
        val backButton = findViewById<Button>(R.id.bnt1)

        //handle backButton.
        backButton.setOnClickListener{
            //getText from edit text
            var city = editText1.text.toString()

            //intent to start activity
            val intent = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(intent)
        }
    }

}