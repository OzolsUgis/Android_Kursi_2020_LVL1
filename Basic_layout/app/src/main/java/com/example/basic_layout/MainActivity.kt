package com.example.day_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnApstiprinat = findViewById<Button>(R.id.btnConfirm)
        val ptName = findViewById<EditText>(R.id.ptName)
        val ptCity = findViewById<EditText>(R.id.ptCity)

        btnApstiprinat.setOnClickListener {
            var name = ptName.text.toString()
            var city = ptCity.text

            var input = name + " lives in " + city

            Toast.makeText(this@MainActivity, input, Toast.LENGTH_SHORT).show()
        }
    }
}
