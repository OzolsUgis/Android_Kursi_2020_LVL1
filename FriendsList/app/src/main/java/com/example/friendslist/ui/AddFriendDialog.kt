package com.example.friendslist.ui

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import com.example.friendslist.data.entities.FriendsList
import kotlinx.android.synthetic.main.friend_add_dialog.*

class AddFriendDialog (context: Context, var dialogListener: DialogListener ) : AppCompatDialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tvAdd.setOnClickListener{
            val name = etFriendsName.text.toString()
            val number = etFriendsNumber.text.toString()

            if (name.isEmpty()||number.isEmpty()){
                Toast.makeText(context, "Enter Valid Information",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val friend = FriendsList(name,number.toInt())
            dialogListener.onAddButtonClickedListener(friend)
            dismiss()

        }
        tvCancel.setOnClickListener{
            cancel()
        }

    }
}