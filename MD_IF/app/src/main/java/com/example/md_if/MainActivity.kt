package com.example.md_if

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstInput = findViewById<EditText>(R.id.ptInput1)
        val secondInput = findViewById<EditText>(R.id.ptInput2)
        val check = findViewById<Button>(R.id.btnCheck)
        val result = findViewById<TextView>(R.id.txtwResult)

        check.setOnClickListener(){
            val fInputtStrLenght = firstInput.text.toString().length
            val sInputStrLenght = secondInput.text.toString().length

            if (fInputtStrLenght > sInputStrLenght){
                result.setText("First string is bigger")
            }else if (fInputtStrLenght < sInputStrLenght) {
                result.setText("Second String is bigger")
            }else if(fInputtStrLenght == sInputStrLenght){
                result.setText("Strings are equal")
            }
        }
    }
}
