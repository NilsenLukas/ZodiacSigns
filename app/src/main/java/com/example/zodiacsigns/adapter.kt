package com.example.zodiacsigns

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class adapter(private val items:ArrayList<String>): RecyclerView.Adapter<adapter.ViewHolder>() {
    class ViewHolder(itemView: View)  : RecyclerView.ViewHolder(itemView){
        val textView : TextView = itemView.findViewById(R.id.sign)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_zodiac, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text=items[position]
    }
    override fun getItemCount(): Int {
        return items.size
    }
}