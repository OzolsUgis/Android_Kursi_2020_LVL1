package com.example.friendslist.data.repository

import com.example.friendslist.data.db.FriendsDatabase
import com.example.friendslist.data.entities.FriendsList

class FriendsRepository(
    private val friendsDatabase: FriendsDatabase
){
    suspend fun updateInsert(item: FriendsList) = friendsDatabase.friendsDao().updateInsert(item)
    suspend fun delete(item: FriendsList) = friendsDatabase.friendsDao().delete(item)
    fun getAllFriends()= friendsDatabase.friendsDao().getAllFriends()
}