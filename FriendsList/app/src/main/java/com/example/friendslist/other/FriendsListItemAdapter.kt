package com.example.friendslist.other

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.friendslist.R
import com.example.friendslist.data.entities.FriendsList
import com.example.friendslist.ui.FriendsViewModel
import kotlinx.android.synthetic.main.friend_list_item.view.*

class FriendsListItemAdapter(
    var items : List<FriendsList>,
    private val viewModel : FriendsViewModel
) : RecyclerView.Adapter<FriendsListItemAdapter.FriendsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.friend_list_item, parent,false)
        return FriendsViewHolder(view)
    }

    override fun onBindViewHolder(holder: FriendsViewHolder, position: Int) {
        val currentItemId = items[position]
        holder.itemView.tvFriendsName.text = currentItemId.friends
        holder.itemView.tvFriendsNumber.text = currentItemId.number.toString()
        holder.itemView.ivDelete.setOnClickListener { viewModel.delete(currentItemId) }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class FriendsViewHolder(friendsListItemView : View) : RecyclerView.ViewHolder(friendsListItemView)
}