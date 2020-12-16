package com.example.day13_md


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //sakas #1
        val btnFact = findViewById<Button>(R.id.btnFact)


        btnFact.setOnClickListener{
            //sis ir garais veids
//            var input = editFact.text.toString()
//
//            var number = input.toInt()
//
//            var result = factorial(number)
//
//            lblResult.text = result.toString()
            //sis ir isais
            sanatizeInputException()


        }

        //sakas MD
        val btnThrow = findViewById<Button>(R.id.btnThrow)

        val lblResultPl1 = findViewById<TextView>(R.id.lblResultPl1)
        val lblResultPl2 = findViewById<TextView>(R.id.lblResultPl2)
        val lblWinResult = findViewById<TextView>(R.id.lblWinResult)
        btnThrow.setOnClickListener{
            var pl1 = getResult(lblResultPl1)
            var pl2 = getResult(lblResultPl2)

            if(pl1 > pl2){
                lblWinResult.text =  "Uzvar pirmais!"
            }else if(pl2>pl1){
                lblWinResult.text =  "Uzvar otrais!"
            }else{
                lblWinResult.text = "Neizšķirts!"
            }

        }
    }

    fun getResult(lbl: TextView): Int {
        val editDiceCount = findViewById<EditText>(R.id.editDiceCount)

        var result = IntArray(editDiceCount.text.toString().toInt())
        var sum = 0

        if (editDiceCount.toString().length > 0) {

            var diceCount = editDiceCount.text.toString().toInt()

            if (diceCount > 0) {
                var diceValues = ""
                for (i in 0..diceCount - 1) {
                    var randomNumber = throwDice()
                    result[i] = randomNumber

                    if (diceValues != "")
                        diceValues = diceValues +"," + result[i].toString()
                    else
                        diceValues = result[i].toString()
                }
                lbl.text = diceValues

            }


        sum = result.sum()


    }


        return sum

    }

    fun throwDice(): Int{
        return (1..6).random()
    }

    fun sanatizeInputException(){
        val editFact = findViewById<EditText>(R.id.editFact)
        val lblResult = findViewById<TextView>(R.id.lblResult)
        try{
            var number = editFact.text.toString().toInt()
            lblResult.text = factorial(number).toString()
        }catch(ex: Exception){
            Toast.makeText(this@MainActivity, "Nepareiza ievade!",
                Toast.LENGTH_LONG).show()

        }

    }

    fun sanatizeInputLen(){
        val editFact = findViewById<EditText>(R.id.editFact)
        val lblResult = findViewById<TextView>(R.id.lblResult)

        if(editFact.text.toString().length > 0){
            var number = editFact.text.toString().toInt()
            lblResult.text = factorial(number).toString()
        }else{
            Toast.makeText(this@MainActivity, "Nepareiza ievade!",
                Toast.LENGTH_LONG).show()
        }
    }

    fun factorial(number: Int) : Int{

        var result: Int = 1

        for(i in 2..number){
//            result = result * i
            result *= i
        }

        return result
    }
}
