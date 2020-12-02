
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



    }

}





