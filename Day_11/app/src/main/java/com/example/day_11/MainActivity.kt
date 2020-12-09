package com.example.day_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val outputResult = findViewById<TextView>(R.id.txtOutput)
        val btnResult = findViewById<Button>(R.id.btnResult)

        btnListener(btnResult, outputResult)


    }

    fun factorial(startRange: Int, endRange:Int): Int {

        var startNumber = startRange
        var endRange = endRange

        var randomNumber = (1..10).random()
        for (i in startRange..endRange) {
            randomNumber = randomNumber * i
        }
        return randomNumber
    }

    fun btnListener(btn: Button, txtw: TextView) {
        btn.setOnClickListener() {
            val inputRangeNum = findViewById<EditText>(R.id.txtInput)
            var value = inputRangeNum.text.toString().toInt()
            val inputValueNumber = findViewById<EditText>(R.id.txtInput2)
            var rangeEndValue = inputValueNumber.text.toString().toInt()

            var x1 : Int
            var x2 : Int

            if (value< 1 || value > 10){
                Toast.makeText(this@MainActivity, "Enter valid first number !",Toast.LENGTH_SHORT).show()
                inputRangeNum.text.clear()
            }else if (value.toString() == "") {
                x1 = 1
            }else {
                x1 = value
            }

            if (rangeEndValue < 1 && rangeEndValue <= value || rangeEndValue > 10 && rangeEndValue <= value){
                Toast.makeText(this@MainActivity, "Enter valid end number !",Toast.LENGTH_SHORT).show()
                inputValueNumber.text.clear()
            }else if (rangeEndValue.toString() == ""){
                x2 = 10
            }else {
                x2 = rangeEndValue
            }

            var result = factorial(value,rangeEndValue)
            txtw.setText(result.toString())




        }
    }
}