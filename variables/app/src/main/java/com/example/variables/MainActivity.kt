package com.example.variables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlus = findViewById<Button>(R.id.btnPlus)
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)

        val number1 = findViewById<EditText>(R.id.numEditNumber1)
        val number2 = findViewById<EditText>(R.id.numEditNumber2)

        val txtwResult = findViewById<TextView>(R.id.txtwResult)
        //val btnResut = findViewById<Button>(R.id.btnResult)



        btnPlus.setOnClickListener(){
            val plus = number1.text.toString().toInt() + number2.text.toString().toInt()
           // Toast.makeText(this@MainActivity, plus.toString(),Toast.LENGTH_SHORT ).show()
            txtwResult.text = plus.toString()
        }

         btnMinus.setOnClickListener(){
            val minus = number1.text.toString().toInt() - number2.text.toString().toInt()
            //Toast.makeText(this@MainActivity, minus.toString(),Toast.LENGTH_SHORT ).show()

             txtwResult.text = minus.toString()
        }

         btnMultiply.setOnClickListener(){
           val multiply = number1.text.toString().toInt() * number2.text.toString().toInt()
           // Toast.makeText(this@MainActivity, multiply.toString(),Toast.LENGTH_SHORT ).show()
             txtwResult.text = multiply.toString()
        }
         btnDivide.setOnClickListener(){
            val divide : Double = number1.text.toString().toDouble() / number2.text.toString().toDouble()
           // Toast.makeText(this@MainActivity, divide.toString(),Toast.LENGTH_SHORT ).show()
             txtwResult.text = divide.toString()
        }

    }
}