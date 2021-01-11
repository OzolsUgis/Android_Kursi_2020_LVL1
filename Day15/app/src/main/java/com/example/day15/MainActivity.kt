package com.example.day15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lblName.setHint("Enter Student's Name")
        lblLastName.setHint("Enter Student's Last Name")
        lblAge.setHint("Enter Student's Age")


        var uzvaretajs = false
        var list: MutableList<Student> = mutableListOf()
        var json = ""

        btnAdd.setOnClickListener {
            list.add(
                Student(
                    lblName.text.toString(),
                    lblLastName.text.toString(),
                    lblAge.text.toString().toInt(),
                    0
                )
            )
            lblName.text.clear()
            lblLastName.text.clear()
            lblAge.text.clear()
            Toast.makeText(
                this@MainActivity, "Student saved",
                Toast.LENGTH_SHORT
            ).show()
            json = JsonParser.saveToJson(list) // Json Parser
            Log.d("NAME: ", json)
        }

        btnCheckStudent.setOnClickListener {
            val fromString = JsonParser.getFromJson(json)
            val check = btnCheckStudent.text.toString().toInt() - 1
            var output = ""
            val checkIndex = list.getOrNull(check)
            if (checkIndex == null) {
                Toast.makeText(
                    this@MainActivity, "Student Not Found",
                    Toast.LENGTH_SHORT
                ).show()

            } else {
                output = list[check].name
                Toast.makeText(
                    this@MainActivity, output + " Already saved ",
                    Toast.LENGTH_SHORT
                ).show()

            }
        }

        btnDelete.setOnClickListener {
            val delete = lblDelete.text.toString().toInt() - 1
            Toast.makeText(
                this@MainActivity, "Student - " + list[delete].name + " Deleted",
                Toast.LENGTH_SHORT
            ).show()
            list.removeAt(delete)

        }

        btnLottery.setOnClickListener {
            var random = (0..list.size - 1).random()
            var vinner = list[random].name
            list[random].winCount = list[random].winCount + 1
            Toast.makeText(
                this@MainActivity, "Apsveicam - " + vinner + " ar laimēto saldumu kasti",
                Toast.LENGTH_SHORT
            ).show()

            if (list[random].winCount == 3) {
                lblWinner.text = "Galveno balvu laimē " + list[random].name
                for (i in 0..list.size - 1) {
                    list[i].winCount = 0
                    lblWinner.text = ""
                }
            }



            btnCheckStudentName.setOnClickListener {
                Log.d("NAME:",json)
                val fromString = JsonParser.getFromJson(json)
                for (el in fromString) {
                    Log.d("NAME:", el.name)
                }
            }
        }
    }
}