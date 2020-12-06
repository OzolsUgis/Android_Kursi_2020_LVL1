package com.example.day9

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
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

        setListener(firstBtn, false)
        setListener(secondBtn,false)
        setListener(thirdBtn,false)





    }


    fun setListener(btn: Button,x:Boolean) {


        val fourthBtn = findViewById<Button>(R.id.btnForth)
        var colorOn = false




        var greenColorOn =x
        var blueColorOn =x
        var redColorOn: Boolean
        redColorOn = x

        btn.setOnClickListener {


            if (btn.text.toString() == "1" && colorOn == false ) {
                redColorOn = true
                colorOn = true
                fourthBtn.setBackgroundColor(Color.RED)
                Toast.makeText(this@MainActivity, "Red color On", Toast.LENGTH_SHORT).show()
            }

            else if (btn.text.toString() == "1" && colorOn == true && redColorOn==true) {
                colorOn = false
                redColorOn = false
                fourthBtn.setBackgroundColor(Color.BLACK)
                Toast.makeText(this@MainActivity, "Red color off", Toast.LENGTH_SHORT).show()
            }

            else if (btn.text.toString() == "2" && colorOn == true && redColorOn == true) {
                colorOn = true
                greenColorOn = true
                    fourthBtn.setBackgroundColor(Color.YELLOW)
                Toast.makeText(this@MainActivity, "green color On", Toast.LENGTH_SHORT).show()

            }

            else if (btn.text.toString() == "2" && colorOn == true) {
                colorOn = false
                greenColorOn = false
                Toast.makeText(this@MainActivity, "green color off", Toast.LENGTH_SHORT).show()
            } else if (btn.text.toString() == "3" && colorOn == false) {
                colorOn = true
                blueColorOn = true

                Toast.makeText(this@MainActivity, "blue color On", Toast.LENGTH_SHORT).show()
            } else if (btn.text.toString() == "3" && colorOn == true) {
                colorOn = false
                blueColorOn = false
                fourthBtn.setBackgroundColor(Color.BLUE)

                Toast.makeText(this@MainActivity, "blue color off", Toast.LENGTH_SHORT).show()
        }else{
                Toast.makeText(this@MainActivity, "what", Toast.LENGTH_SHORT).show()
            }
        }


    }
}









