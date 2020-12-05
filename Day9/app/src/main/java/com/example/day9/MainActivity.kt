package com.example.day9

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

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

        setListener(firstBtn)
        setListener(secondBtn)
        setListener(thirdBtn)


    }

    fun setListener(btn: Button ) {
        val fourthBtn = findViewById<Button>(R.id.btnForth)
        btn.setOnClickListener {
            if (btn.text.toString() == "1"){
                fourthBtn.setBackgroundColor(Color.RED)
            }else if(btn.text.toString() == "2"){
                fourthBtn.setBackgroundColor(Color.GREEN)
            }else if (btn.text.toString() == "3"){
                fourthBtn.setBackgroundColor(Color.BLUE)
            }else {
                fourthBtn.setBackgroundColor(Color.BLACK)
            }
        }

    }


}
