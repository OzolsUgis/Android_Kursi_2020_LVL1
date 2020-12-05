package com.example.day9

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.function.BooleanSupplier

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstBtn = findViewById<Button>(R.id.btnFirst)
        val secondBtn = findViewById<Button>(R.id.btnSecond)
        val thirdBtn = findViewById<Button>(R.id.btnThird)
        val fourthBtn = findViewById<Button>(R.id.btnForth)



        firstBtn.setBackgroundColor(Color.RED)
        secondBtn.setBackgroundColor(Color.GREEN)
        thirdBtn.setBackgroundColor(Color.BLUE)

        setListener(firstBtn,true)
        setListener(secondBtn,true)
        setListener(thirdBtn,true)


    }





    fun setListener(btn: Button, inputColor:Boolean) {

        var color = inputColor
        var redColor : Boolean = true
        var greenColor : Boolean= true
        var blueColor : Boolean=true

        val fourthBtn = findViewById<Button>(R.id.btnForth)


        btn.setOnClickListener {
            if (btn.text.toString() == "1") {
                if (color == false) {
                    redColor = true
                    color = true
                } else if (color == true){
                    redColor = false
                    color = false
                }

                }
            else if(btn.text.toString() == "2"){
                if (color == false) {
                    greenColor = true
                    color == true
                } else if (color == true){
                    greenColor = false
                    color= false
                }

            else if(btn.text.toString() == "3") {
                if (color == false) {
                    blueColor = true
                    color = true
                } else if (color == true) {
                    blueColor = false
                    color= false
                }


    }
        if (redColor==true){
            fourthBtn.setBackgroundColor(Color.RED)
        }else if (redColor == true && greenColor == true){
            fourthBtn.setBackgroundColor(Color.YELLOW)
        }else if (redColor == true && blueColor==true){
            fourthBtn.setBackgroundColor(Color.MAGENTA)
        } else if (blueColor== true){
            fourthBtn.setBackgroundColor(Color.BLUE)
        }else if (blueColor== true && greenColor==true){
            fourthBtn.setBackgroundColor(Color.CYAN)
        } else if (greenColor==true){
            fourthBtn.setBackgroundColor(Color.CYAN)
        }else if (greenColor==true&&blueColor==true&&redColor==true){
            fourthBtn.setBackgroundColor(Color.WHITE)

        }
            }
        }

    }






}
