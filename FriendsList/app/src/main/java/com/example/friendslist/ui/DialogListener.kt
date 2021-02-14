package com.example.friendslist.ui

import com.example.friendslist.data.entities.FriendsList

interface DialogListener {
    fun onAddButtonClickedListener(item:FriendsList)
}