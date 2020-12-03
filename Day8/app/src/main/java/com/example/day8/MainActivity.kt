package com.example.day8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    fun day (a : Int){
        val outputDay = findViewById<TextView>(R.id.txtOutputDay)
        when (a) {
            1 -> outputDay.setText("Monday")
            2 -> outputDay.setText("Tuesday")
            3-> outputDay.setText("Wednesday")
            4-> outputDay.setText("Thursday")
            5-> outputDay.setText("Friday")
            6-> outputDay.setText("Saturday")
            7-> outputDay.setText("Sunday")
            else -> { outputDay.setText("Enter Number between 1 - 7 !!! ") }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val inputText = findViewById<EditText>(R.id.txtInputNumber)
        val btnDay = findViewById<Button>(R.id.btnShowDay)
        val outputDay = findViewById<TextView>(R.id.txtOutputDay)



        btnDay.setOnClickListener(){
            day(inputText.text.toString().toInt())
            inputText.text.clear()
        }
    }
}
