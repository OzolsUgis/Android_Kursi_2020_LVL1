package com.example.day6_md

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputNumber = findViewById<EditText>(R.id.ptEnterNumber)
        val button = findViewById<Button>(R.id.btnCheck)

        val number = inputNumber.text.toString().toDouble()

        val double : Double = 0.0

        button.setOnClickListener() {
            if (number < double ) {
                Toast.makeText(this@MainActivity, "Input number is Negative", Toast.LENGTH_SHORT)
                    .show()
                inputNumber.text.clear()
            } else if (number > double){
                Toast.makeText(this@MainActivity, "Input number is Positive", Toast.LENGTH_SHORT)
                    .show()
                inputNumber.text.clear()
            }else{
                Toast.makeText(this@MainActivity, "That's Not A Number", Toast.LENGTH_SHORT)
                    .show()
                inputNumber.text.clear()
            }

        }
    }
}
