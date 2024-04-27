package com.example.imagenes3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


class Imagen : Fragment(R.layout.fragment_imagen) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gatoboton = view.findViewById<ImageView>(R.id.gatoboton)
        gatoboton.setOnClickListener{
            Toast.makeText(requireContext(),"chipi chipi chapa chapa dubi dubi daba daba", Toast.LENGTH_LONG).show()
        }
        /* Creo una variable para la imagen boton y le asigno la imagen un set on click para que al tocar
        salga un toast
       Nota: es lo mismo para cada imagen asi que no me repetire

        */

    }
}


