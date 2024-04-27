package com.example.imagenes3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast

class Imagen_2 : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pedroboton = view.findViewById<ImageView>(R.id.pedroboton)
        pedroboton.setOnClickListener{
            Toast.makeText(requireContext(),"pedro pedro pedro pedro", Toast.LENGTH_LONG).show()
        }
    }
}