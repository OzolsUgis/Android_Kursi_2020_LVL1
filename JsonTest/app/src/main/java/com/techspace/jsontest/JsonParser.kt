package com.techspace.jsontest

import android.content.Context
import com.google.gson.Gson

object JsonParser {

    fun saveToJson(userList:  MutableList<User>): String{
        val json = Gson().toJson(userList)
        return json
    }

    fun getArr(json: String): Array<User>{
        return Gson().fromJson(json, Array<User>::class.java)
    }

}