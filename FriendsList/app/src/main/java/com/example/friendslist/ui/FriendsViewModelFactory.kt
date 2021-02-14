package com.example.friendslist.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.friendslist.data.repository.FriendsRepository

class FriendsViewModelFactory(
    private val repository: FriendsRepository
): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FriendsViewModel(repository) as T
    }
}