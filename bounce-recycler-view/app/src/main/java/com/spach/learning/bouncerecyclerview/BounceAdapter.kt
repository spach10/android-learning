package com.spach.learning.bouncerecyclerview

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BounceAdapter : RecyclerView.Adapter<BounceAdapter.MyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount() = 20

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textView = itemView.findViewById<TextView>(R.id.textView)

        @SuppressLint("SetTextI18n")
        fun bind(position: Int) {
            textView.text = "Item $position"
        }
    }
}