package com.example.gestion.Adaptador

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gestion.R
import com.example.gestion.Usuarios

class Holder(itemView: View):RecyclerView.ViewHolder(itemView) {
    val vernombre = itemView.findViewById<TextView>(R.id.txnombre)
    val veredad = itemView.findViewById<TextView>(R.id.txedad)
    val vertel = itemView.findViewById<TextView>(R.id.txnumero)
    fun llenar(item:Usuarios){
        vernombre.text = item.nombre
        veredad.text = item.edad.toString()
        vertel.text = item.telefono.toString()
    }

}