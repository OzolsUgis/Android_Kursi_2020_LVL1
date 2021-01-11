package com.example.day15

import com.google.gson.Gson

object JsonParser {
        fun saveToJson (list : MutableList<Student>):String {
            val json = Gson().toJson(list)
            return json
        }

        fun getFromJson (json : String): Array<Student> {
            return Gson().fromJson(json, Array<Student>::class.java)
        }
}