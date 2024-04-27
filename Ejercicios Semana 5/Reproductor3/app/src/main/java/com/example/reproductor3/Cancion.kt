package com.example.reproductor3

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class Cancion : Fragment(R.layout.fragment_cancion) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var  cancion = MediaPlayer.create(requireContext(),R.raw.into_the_night)
        var play = view.findViewById<Button>(R.id.Play)
        var pause = view.findViewById<Button>(R.id.Pausar)
        var detener = view.findViewById<Button>(R.id.Detener)
        /* Variables para cada boton en la interfaz y uno para la cancion el cual nos pide el contexto el cual
                sería este por eso this y la ubicación que sería en la carpeta raw
                 */
        play.setOnClickListener{
            cancion.start()
        }
        pause.setOnClickListener{
            cancion.pause()
        }
        detener.setOnClickListener{
            cancion.stop()
            cancion= MediaPlayer.create(requireContext(),R.raw.into_the_night)
        }
        /* Funciones que al clickar un boton haga su respectiva función las cuales ya vienen con el android studio
       start para empezar la canción, pause para pararla, stop para que no se pueda reproducir de nuevo y para
       arreglar esto se reinicia la variable cancion poniendole de nuevo la cancion
       */
    }

}