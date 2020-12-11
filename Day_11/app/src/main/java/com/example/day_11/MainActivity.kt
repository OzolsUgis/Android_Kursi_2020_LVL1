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
        var endNumber = endRange

        var randomNumber = (0..11).random()
        for (i in startNumber..endNumber) {
            randomNumber = randomNumber * i
        }
        return randomNumber
    }

    fun btnListener(btn: Button, txtw: TextView) {

        btn.setOnClickListener() {
            var x1 : Int
            var x2 : Int
            val empty : String = " "
            val inputRangeStartNum = findViewById<EditText>(R.id.txtInput)
            var rangeStartValue = inputRangeStartNum.text.toString().toInt()
            val inputRangeEndNumber = findViewById<EditText>(R.id.txtInput2)
            var rangeEndValue = inputRangeEndNumber.text.toString().toInt()




            if(rangeStartValue>= 1 && rangeStartValue < rangeEndValue && rangeStartValue < 10){
                x1 = rangeStartValue
            }else if (rangeStartValue.toString() == empty) {
                x1 = 1
            }else {
                Toast.makeText(this@MainActivity, "Enter valid first number !",Toast.LENGTH_SHORT).show()
                x1 = 1
                inputRangeStartNum.text.clear()
//            Here you must have initialized x1 ... ????????



            }

            if (rangeEndValue > 1 && rangeEndValue > rangeStartValue &&  rangeEndValue <= 10 ){
                x2 = rangeEndValue

            }else if (rangeEndValue.toString() == empty){
                x2 = 10

            }else {
                Toast.makeText(this@MainActivity, "Enter valid end number ! Next time, but now we will use 10",Toast.LENGTH_SHORT).show()
                x2=10
                inputRangeEndNumber.text.clear()

                //            Here you must have initialized x2...???????

            }

            var result = factorial(x1,x2)
            txtw.setText(result.toString())




        }
    }
}