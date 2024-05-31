package com.example.gestion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class Datos : Fragment(R.layout.fragment_datos) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var btnlisto = view.findViewById<Button>(R.id.btnlisto)
        btnlisto.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().apply {
                replace(R.id.Recycler,Recycler())
                addToBackStack("")
                commit()
            }
        }
    }
}