package com.example.day7_wasfun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    fun stringConc(a : String, b : String, c : String){
        Toast.makeText(this@MainActivity, a + b + c, Toast.LENGTH_SHORT).show()
    }

    fun intComp (x : Int, y : Int){
        if (x > y){
            Toast.makeText(this@MainActivity, x.toString(), Toast.LENGTH_SHORT).show()
        }else {
            Toast.makeText(this@MainActivity, y.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stringConc("My ", "Name = ", "Ugis")
        intComp(9,6)
    }
}
