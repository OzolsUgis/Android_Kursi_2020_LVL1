package com.example.day13_md

import android.widget.EditText
import android.widget.TextView

class GetResult {

    fun getResult(lbl: TextView, editDiceCount: EditText): Int {


        var result = IntArray(editDiceCount.text.toString().toInt())
        var sum = 0

        if (editDiceCount.toString().length > 0) {

            var diceCount = editDiceCount.text.toString().toInt()

            if (diceCount > 0) {
                var diceValues = ""
                for (i in 0..diceCount - 1) {
                    var randomNumber = RandomNum().throwDice()
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
}