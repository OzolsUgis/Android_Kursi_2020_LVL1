package com.example.day11_md

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.INotificationSideChannel
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll = findViewById<Button>(R.id.btnRoll)
        val outputField = findViewById<TextView>(R.id.txtwOutput)


        rollTheDice(btnRoll,outputField)

    }

    fun diceNumber  (num:Int):Int{
        var random:Int = 0
            for (i in 1..num){
                var dice: Int = (1..6).random()
                random += dice
            }
        return random
    }

    fun rollTheDice (btn : Button, txtw : TextView){
        val dices = findViewById<EditText>(R.id.txtwDiceNumber)
        dices.setHint("Enter How many dices you want")

        btn.setOnClickListener{
            txtw.text =diceNumber(dices.text.toString().toInt()).toString()
        }
    }
}
