package com.example.friendslist.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.friendslist.data.entities.FriendsList

@Dao
interface FriendsListDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateInsert(item: FriendsList)

    @Delete
    suspend fun delete(item:FriendsList)

    @Query("SELECT * FROM friends")
    fun getAllFriends() : LiveData<List<FriendsList>>
}