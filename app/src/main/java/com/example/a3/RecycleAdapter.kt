package com.example.a3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class RecycleAdapter(var list: ArrayList<Model>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return userViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user: Model = list[position]
        if(holder is userViewHolder){
            holder.oval.setImageResource(user.oval)
            holder.name.text = user.name
            holder.text.text = user.text
        }

    }
    class userViewHolder(view: View): RecyclerView.ViewHolder(view){
        val oval:ShapeableImageView = view.findViewById(R.id.oval_id)
        val name: TextView = view.findViewById(R.id.name_id)
        val text: TextView = view.findViewById(R.id.text_id)
    }
}