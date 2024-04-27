package com.example.reproductor3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner


class Spinner : Fragment(R.layout.fragment_spinner) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        super.onViewCreated(view, savedInstanceState)
        val siguiente = view.findViewById<Button>(R.id.siguiente)
        val spinner= view.findViewById<Spinner>(R.id.spinner)
        val eleccion = resources.getStringArray(R.array.canciones)
        val adaptador = ArrayAdapter(requireContext(),android.R.layout.simple_spinner_item,eleccion)
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adaptador
        /* Creo un spinner con su adaptador que esta hecho con una variable eleccion que esta formada por
        un string de array en la parte de values-strings
        */
        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            /* Creo un onitemselected para el spinner parecido al de la actidad 2 solo cambio la posisicon
            del boton siguiente al inicio del when y el contenido del when por un requireActivity
            reemplazando el spinner fragment por un imagen fragment y eliminé el boton de atras por
            el addToBackSack para que solo se de al boton de atras del celular por default
             */
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                siguiente.setOnClickListener{
                    when (eleccion[position]) {
                        eleccion[0] -> {
                            requireActivity().supportFragmentManager.beginTransaction().apply {
                                replace(R.id.spinner,Cancion())
                                addToBackStack("")
                                commit()
                            }
                        }

                        eleccion[1] -> {
                            requireActivity().supportFragmentManager.beginTransaction().apply {
                                replace(R.id.spinner,Cancion_2())
                                addToBackStack("")
                                commit()
                            }

                        }

                        eleccion[2] -> {
                            requireActivity().supportFragmentManager.beginTransaction().apply {
                                replace(R.id.spinner,Cancion_3())
                                addToBackStack("")
                                commit()
                            }

                        }
                        eleccion[3] -> {
                            requireActivity().supportFragmentManager.beginTransaction().apply {
                                replace(R.id.spinner,Cancion_4())
                                addToBackStack("")
                                commit()
                            }

                        }
                        eleccion[4] -> {
                            requireActivity().supportFragmentManager.beginTransaction().apply {
                                replace(R.id.spinner,Cancion_5())
                                addToBackStack("")
                                commit()
                            }

                        }
                    }
                }


            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }
}