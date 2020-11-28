package com.example.day6_string_2

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

        var reverse : Boolean = false

        btnPushMe.setOnClickListener() {
            var skaitlis = txtwOutput.text.toString().toInt()

            if (skaitlis == 10) {
                reverse = true
            } else if (skaitlis == 0){
                reverse = false
            }

            if(reverse == false){
                skaitlis++
            }else{
                skaitlis--
            }

            var txt = skaitlis.toString()
            txtwOutput.text =txt
        }
    }
}

