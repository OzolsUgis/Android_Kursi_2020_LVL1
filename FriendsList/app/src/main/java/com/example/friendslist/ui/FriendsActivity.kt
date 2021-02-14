package com.example.friendslist.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.friendslist.R
import com.example.friendslist.data.db.FriendsDatabase
import com.example.friendslist.data.entities.FriendsList
import com.example.friendslist.data.repository.FriendsRepository
import com.example.friendslist.other.FriendsListItemAdapter
import kotlinx.android.synthetic.main.activity_friends_main.*

class FriendsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends_main)

        val database = FriendsDatabase(this)
        val repository = FriendsRepository(database)
        val factory = FriendsViewModelFactory(repository)
        val viewModel = ViewModelProvider(this, factory).get(FriendsViewModel::class.java)

        val adapter = FriendsListItemAdapter(listOf(), viewModel)
        rvFriendsList.layoutManager = LinearLayoutManager(this)
        rvFriendsList.adapter = adapter

        viewModel.getAllFriends().observe(this, Observer {
            adapter.items = it
            adapter.notifyDataSetChanged()
        })

        fab.setOnClickListener{
            AddFriendDialog(this, object: DialogListener{
                override fun onAddButtonClickedListener(item: FriendsList) {
                    viewModel.updateInsert(item)
                }

            }).show()
        }
    }
}