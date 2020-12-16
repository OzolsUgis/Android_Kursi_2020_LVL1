package com.example.day_14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val num1 = findViewById<EditText>(R.id.lblNum1)
//        val num2 = findViewById<EditText>(R.id.lblNum2)
//        val num3 = findViewById<EditText>(R.id.lblNum3)
//        val num4 = findViewById<EditText>(R.id.lblNum4)
//        val num5 = findViewById<EditText>(R.id.lblNum5)
//
//        val btn = findViewById<Button>(R.id.btnShowHighest)
//        var text = findViewById<TextView>(R.id.lblOutput)
//
//        var numbers = IntArray(5)
//
//        btn.setOnClickListener(){
//
//            numbers[0] = num1.text.toString().toInt()
//            numbers[1] = num2.text.toString().toInt()
//            numbers[2] = num3.text.toString().toInt()
//            numbers[3] = num4.text.toString().toInt()
//            numbers[4] = num5.text.toString().toInt()
//
//            var highest = numbers[0]
//
//            for(el in numbers){
//                if (highest < el)
//                    highest=el
//            }
//
//            text.text = highest.toString()
//        }



        val enterValue = findViewById<EditText>(R.id.lblValue)
        val btnSaveValue = findViewById<Button>(R.id.btnSaveValue)
        val btnOutputList= findViewById<Button>(R.id.btnOutputList)
        val output = findViewById<TextView>(R.id.txtOutputList)

        var values = mutableListOf<Int>()

        btnSaveValue.setOnClickListener(){
            values.add(enterValue.text.toString().toInt())
        }

        btnOutputList.setOnClickListener(){
            var list :String = ""
            for (element in values){
                list = list + element.toString()+ ","
            }
            output.text = list
        }
    }
}

