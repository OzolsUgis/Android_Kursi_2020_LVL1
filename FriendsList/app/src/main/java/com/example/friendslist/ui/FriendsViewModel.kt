package com.example.friendslist.ui

import androidx.lifecycle.ViewModel
import com.example.friendslist.data.entities.FriendsList
import com.example.friendslist.data.repository.FriendsRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FriendsViewModel(
    private val repository: FriendsRepository
): ViewModel() {
    fun updateInsert(item: FriendsList) =
        CoroutineScope(Dispatchers.Main).launch {
            repository.updateInsert(item)
        }
    fun delete(item: FriendsList)= CoroutineScope(Dispatchers.Main).launch {
        repository.delete(item)
    }
    fun getAllFriends() = repository.getAllFriends()
}