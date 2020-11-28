package com.example.day6_string

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPushMe = findViewById<Button>(R.id.btnPushMe)
        val txtwOutput = findViewById<TextView>(R.id.txtwOutput)


            btnPushMe.setOnClickListener(){
                val skaitlis = txtwOutput.text.toString().toInt() + 1
                txtwOutput.text = skaitlis.toString()
            }

    }
}

