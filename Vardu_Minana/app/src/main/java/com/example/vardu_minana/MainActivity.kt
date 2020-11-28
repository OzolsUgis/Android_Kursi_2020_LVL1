package com.example.vardu_minana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var word : String= ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputText = findViewById<EditText>(R.id.ptInputText)
        val inputWord = findViewById<EditText>(R.id.ptWordInput)
        val checkButton = findViewById<Button>(R.id.btnCheck)
        val tryToGuess = findViewById<Button>(R.id.btnTryToGuess)

        val guessing = inputWord.text
         word = inputText.toString()


        var count : Int = 0

        tryToGuess.setOnClickListener(){
            if (word == ""){
                Toast.makeText(this@MainActivity, "Enter Word", Toast.LENGTH_SHORT).show()
            } else{
                word = inputText.text.toString()
                Toast.makeText(this@MainActivity, "You can start Guessing ", Toast.LENGTH_SHORT).show()
            }
            inputText.setText("")
        }

        checkButton.setOnClickListener(){
            count = count + 1
            if (guessing.toString() == word){
                Toast.makeText(this@MainActivity, "You guessed word : " + word, Toast.LENGTH_SHORT).show()
                count = 0
            }else if (guessing.toString() != word && count < 5){
                Toast.makeText(this@MainActivity, "Wrong, Guess again!", Toast.LENGTH_SHORT).show()
            }else if (guessing.toString() != word && count == 5){
                Toast.makeText(this@MainActivity, "You Lost", Toast.LENGTH_SHORT).show()
                count = 0

            }
        }


    }


}
