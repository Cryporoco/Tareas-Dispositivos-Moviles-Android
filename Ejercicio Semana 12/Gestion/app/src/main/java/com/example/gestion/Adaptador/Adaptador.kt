package com.example.gestion.Adaptador

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gestion.R
import com.example.gestion.Usuarios

class Adaptador (var item : List<Usuarios>): RecyclerView.Adapter<Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.cardview,parent)
        return Holder(itemView)
    }

    override fun getItemCount(): Int {
    return item.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val items = item[position]
        holder.llenar(items)
    }

}