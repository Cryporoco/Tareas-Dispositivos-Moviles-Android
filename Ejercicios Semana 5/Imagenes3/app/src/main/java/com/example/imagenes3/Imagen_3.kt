package com.example.imagenes3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast

class Imagen_3 : Fragment(R.layout.fragment_imagen_3) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val americaboton = view.findViewById<ImageView>(R.id.americaboton)
        americaboton.setOnClickListener{
            Toast.makeText(requireContext(),"America ya, yaho", Toast.LENGTH_LONG).show()
        }
    }
}