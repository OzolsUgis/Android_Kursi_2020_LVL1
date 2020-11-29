package com.example.day6_md

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


    //  ================================================================================================================================================
      //MD Pimais Uzdevums

        val inputNumber = findViewById<EditText>(R.id.ptEnterNumber)
        val button = findViewById<Button>(R.id.btnCheck)

        button.setOnClickListener() {
            val number = inputNumber.text.toString().toDouble()
            if (number < 0) {
                     Toast.makeText(this@MainActivity, "Input number is Negative", Toast.LENGTH_SHORT).show()
                     inputNumber.text.clear()
            } else if (number> 0){
                     Toast.makeText(this@MainActivity, "Input number is Positive", Toast.LENGTH_SHORT).show()
                    inputNumber.text.clear()
            }
        }

  // ================================================================================================================================================
      // MD Otrais Uzdevums

        val inputText = findViewById<EditText>(R.id.ptInputWord)
        val checkBtn = findViewById<Button>(R.id.checkInput)

        inputText.setOnClickListener(){
            inputText.text.clear()
        }
        checkBtn.setOnClickListener(){
            val text = inputText.text.toString().length.toString()
            Toast.makeText(this@MainActivity,"Word " + inputText.text.toString()+ " Have " + text + " Letters",Toast.LENGTH_SHORT).show()
            inputText.text.clear()
        }

//==========================================================================================================================================================
        //MD trešais Uzdevums

        val inputDouble = findViewById<EditText>(R.id.ptDouble)
        val addOne = findViewById<Button>(R.id.btnAdd)
        val output = findViewById<TextView>(R.id.txtwOutputDouble)

        inputDouble.setOnClickListener(){
            inputDouble.text.clear()
        }

        addOne.setOnClickListener(){
            if(inputDouble.text.toString() == ""){
                Toast.makeText(this@MainActivity, "Insert Double", Toast.LENGTH_SHORT).show()
            }else {
                val value = inputDouble.text.toString().toDouble()
                val newInput = value + 1
                output.text = newInput.toString()
                inputDouble.text.clear()
            }
        }
//======================================================================================================================================================
            //MD 4.TAIS Uzdevums

        val num1 = findViewById<EditText>(R.id.ptNum1)
        val num2 = findViewById<EditText>(R.id.ptNum2)
        val num3 = findViewById<EditText>(R.id.ptNum3)
        val count = findViewById<Button>(R.id.btnCount)

        num2.setOnClickListener(){
            num2.text.clear()
        }
        num1.setOnClickListener(){
            num1.text.clear()
        }
        num3.setOnClickListener(){
            num3.text.clear()
        }

        count.setOnClickListener(){
            val result = num1.text.toString().toInt() + num2.text.toString().toInt() + num3.text.toString().toInt()
            Toast.makeText(this@MainActivity, "Sum = " + result.toString(),Toast.LENGTH_SHORT).show()
            num1.text.clear()
            num2.text.clear()
            num3.text.clear()
        }

        //==============================================================================================================================================

        // MD 5.TAIS Uzdevums

        val insertNumer = findViewById<EditText>(R.id.ptInsertNumber)
        val insertNumer2 = findViewById<EditText>(R.id.ptInsertNumber2)
        val insertResult = findViewById<EditText>(R.id.ptInsertResult)
        val seeResult = findViewById<Button>(R.id.btnSeeResult)

        insertNumer.setOnClickListener(){
            insertNumer.text.clear()
        }
        insertNumer2.setOnClickListener(){
            insertNumer2.text.clear()
        }
        insertResult.setOnClickListener(){
            insertResult.text.clear()
        }


        seeResult.setOnClickListener() {

            val result = insertResult.text.toString()

            if (result == "+") {
                var sum = insertNumer.text.toString().toInt() + insertNumer2.text.toString().toInt()
                Toast.makeText(this@MainActivity, sum.toString(), Toast.LENGTH_SHORT).show()
            } else if (result == "-") {
                var diffirence =
                    insertNumer.text.toString().toInt() - insertNumer2.text.toString().toInt()
                Toast.makeText(this@MainActivity, diffirence.toString(), Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity, "Enter + or - ", Toast.LENGTH_SHORT).show()
                insertResult.text.clear()
            }
            insertNumer.text.clear()
            insertNumer2.text.clear()
            insertResult.text.clear()

        }



    }
}

