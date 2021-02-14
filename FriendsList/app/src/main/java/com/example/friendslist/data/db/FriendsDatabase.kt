package com.example.friendslist.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.friendslist.data.entities.FriendsList


@Database(
    entities = arrayOf(FriendsList::class),
    version = 1
)
abstract class FriendsDatabase : RoomDatabase()  {
    abstract fun friendsDao() : FriendsListDao

    companion object {
        @Volatile
        var instance : FriendsDatabase? = null
        val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also{instance=it}
        }

        fun createDatabase(context: Context)=
            Room.databaseBuilder(context.applicationContext,
                FriendsDatabase::class.java, "friendsListDB.db").build()


    }
}