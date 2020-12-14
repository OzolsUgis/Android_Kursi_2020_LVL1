package com.example.day_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val lblPlayer1DiceVal = findViewById<TextView>(R.id.lblPlayer1DiceVal)
        val lblPlayer1Out = findViewById<TextView>(R.id.lblPlayer1Output)
        val lblPlayer2DiceVal = findViewById<TextView>(R.id.lblPlayer2DiceVal)
        val lblPlayer2Out = findViewById<TextView>(R.id.lblPlayer2Output)
        val btnRollDice = findViewById<Button>(R.id.btnRollDice)

        var count = 0
        var player1Sum: Int = 0
        var player2Sum: Int = 0
        var player1: Int
        var player2: Int

        btnRollDice.setOnClickListener {

            count++

            player1 = random()
            player2 = random()

            lblPlayer1DiceVal.text = player1.toString()
            lblPlayer2DiceVal.text = player2.toString()

            player1Sum += player1
            player2Sum += player2

            lblPlayer1Out.text = player1Sum.toString()
            lblPlayer2Out.text = player2Sum.toString()
            chechWiner(lblPlayer1Out, lblPlayer2Out, count)

            if (count == 6){
                count= 0
                lblPlayer1DiceVal.setText(null)
                lblPlayer2DiceVal.setText(null)
                lblPlayer1Out.setText(null)
                lblPlayer2Out.setText(null)
                player1Sum = 0
                player2Sum=0
            }

        }



    }


    fun random () : Int{
        val randomNumber = (1..6).random()
        return randomNumber

    }

    fun chechWiner (player1:TextView, player2:TextView, checking :Int){
        val player1Score = player1.text.toString().toInt()
        val player2Score = player2.text.toString().toInt()

        if (checking == 5){
            if (player1Score > player2Score ){
                Toast.makeText(this@MainActivity, "Player 1 Wins",
                    Toast.LENGTH_SHORT ).show()
            }else if (player1Score < player2Score){
                Toast.makeText(this@MainActivity, "Player 2 Wins",
                    Toast.LENGTH_SHORT ).show()
            }else if (player1Score == player2Score){
                Toast.makeText(this@MainActivity, "Its A draw",
                    Toast.LENGTH_SHORT ).show()
            }else Toast.makeText(this@MainActivity, "error",
                Toast.LENGTH_SHORT).show()

        }
    }

}



