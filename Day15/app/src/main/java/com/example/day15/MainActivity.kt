package com.example.day15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lblName.setHint("Enter Student's Name")
        lblLastName.setHint("Enter Student's Last Name")
        lblAge.setHint("Enter Student's Age")

        val list: MutableList<Student> = mutableListOf()

        btnAdd.setOnClickListener {

            list.add(
                Student(
                    lblName.text.toString(),
                    lblLastName.text.toString(), lblAge.text.toString().toInt()
                )
            )
            lblName.text.clear()
            lblLastName.text.clear()
            lblAge.text.clear()
            Toast.makeText(this@MainActivity, "Student saved",
                Toast.LENGTH_SHORT).show()
        }

        btnCheckStudent.setOnClickListener {
            val check = lblCheckStudent.text.toString().toInt()
            var output = ""
            val checkIndex = list.getOrNull(check)
                if (checkIndex == null){
                    Toast.makeText(this@MainActivity, "Student Not Found",
                        Toast.LENGTH_SHORT).show()

                }else {
                    output = list[check].name
                    Toast.makeText(this@MainActivity, output + " Already saved ",
                        Toast.LENGTH_SHORT).show()

                }
        }

        btnDelete.setOnClickListener{
            val delete = lblDelete.text.toString().toInt()
            Toast.makeText(this@MainActivity, "Student - "+ list[delete].name + " Deleted",
                Toast.LENGTH_SHORT).show()
            list.removeAt(delete)

        }


    }


}