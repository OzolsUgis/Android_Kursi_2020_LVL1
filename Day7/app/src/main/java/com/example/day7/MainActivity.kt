package com.example.day7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.btnPushMe)
        val txtOutput = findViewById<TextView>(R.id.txtOutput)


        btnClickMe.setOnClickListener(){
            if (txtOutput.text.toString() == ""){
                txtOutput.text=("+")
            }else if (txtOutput.text.toString() == "+"){
                txtOutput.text = "-"
            }else if (txtOutput.text.toString() == "-"){
                txtOutput.text = "+"
            }
        }
    }
}