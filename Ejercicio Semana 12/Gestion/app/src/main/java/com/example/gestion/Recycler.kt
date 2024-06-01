package com.example.gestion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gestion.Adaptador.Adaptador


class Recycler : Fragment(R.layout.fragment_recycler) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var btnagregar = view.findViewById<Button>(R.id.btnagregar)

        btnagregar.setOnClickListener{
                requireActivity().supportFragmentManager.beginTransaction().apply {
                    replace(R.id.Recycler,Datos())
                    addToBackStack("")
                    commit()
                }
        }
    }

    fun iniciar(){
        val userrecycler = view?.findViewById<RecyclerView>(R.id.lista_usuarios)
        if (userrecycler != null) {
            userrecycler.layoutManager = LinearLayoutManager(requireContext())
            userrecycler.adapter = Adaptador(Prueba.lista)
        }
    }




}