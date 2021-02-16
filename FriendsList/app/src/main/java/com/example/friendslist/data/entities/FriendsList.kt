package com.example.friendslist.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "friends")
data class FriendsList(

    @ColumnInfo(name = "friends_name")
    val friends : String,
    @ColumnInfo(name = "number")
    val number : Int
){
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null

}