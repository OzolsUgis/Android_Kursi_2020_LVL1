package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn1 = findViewById<Button>(R.id.btnOne)
        val btn2 = findViewById<Button>(R.id.btnTwo)
        val btn3 = findViewById<Button>(R.id.btnThree)
        val btn4 = findViewById<Button>(R.id.btnFour)
        val btn5 = findViewById<Button>(R.id.btnFive)
        val btn6 = findViewById<Button>(R.id.btnSix)
        val btn7 = findViewById<Button>(R.id.btnSeven)
        val btn8 = findViewById<Button>(R.id.btnEight)
        val btn9 = findViewById<Button>(R.id.btnNine)


        val buttonArray = arrayOf<Button>(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
            for (i in buttonArray){
                i.setOnClickListener(){
                    if(i.text == "-"){
                        i.setText("X")
                    }else if (i.text== "X"){
                        i.setText("O")
                        //Toast.makeText(this@MainActivity," Move is not allowed ", Toast.LENGTH_SHORT).show()
                    }else if (i.text=="O"){
                        i.setText("-")
                        //Toast.makeText(this@MainActivity," Move is not allowed ", Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }
}



