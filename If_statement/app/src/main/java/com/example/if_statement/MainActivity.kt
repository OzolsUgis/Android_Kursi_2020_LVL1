
package com.example.if_statement

import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import android.widget.Button
import android.widget.Toast



class MainActivity : AppCompatActivity() {


    var rememberedValue= ""


    /*      Kods strādā līdz uzdevuma trešajam punktam, ceturto punktu vēl
            Vēl īsti nesapratu kā līdz galam sataisīt to String summēšanu
     */




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.ptInput)
        val output = findViewById<Button>(R.id.btnOutput)
        val reversedOutput = findViewById<Button>(R.id.btnReverseOutput)


        val test1 = input.text
        val test2 = input.text
        rememberedValue = test1.toString()




        output.setOnClickListener() {
            Toast.makeText(this@MainActivity, input.text, Toast.LENGTH_SHORT).show()
        }

        reversedOutput.setOnClickListener() {
            if (rememberedValue == String()) {
                val resultReversed = rememberedValue + test2.toString()
                Toast.makeText(this@MainActivity, resultReversed.reversed(), Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this@MainActivity, input.text.reversed(), Toast.LENGTH_SHORT).show()
            }
        }


    }

}

/*

var outputFunction = output.setOnClickListener(){
            Toast.makeText(this@MainActivity, input.text , Toast.LENGTH_SHORT).show()
           }
        var reversedOutputFun = reversedOutput.setOnClickListener(){
            rememberedValue = input.text.toString().reversed()
        }

        if(rememberedValue === input.text.toString().reversed()){
            rememberedValue = input.text.toString() + rememberedValue
            reversedOutput.setOnClickListener(){
                Toast.makeText(this@MainActivity, rememberedValue, Toast.LENGTH_SHORT).show()
            }
            }else{
                Toast.makeText(this@MainActivity, input.text.reversed(), Toast.LENGTH_SHORT).show()
        }
    }
}


*/



