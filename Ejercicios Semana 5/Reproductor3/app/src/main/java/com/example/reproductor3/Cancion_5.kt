package com.example.reproductor3

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class Cancion_5 : Fragment(R.layout.fragment_cancion_5) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var  cancion = MediaPlayer.create(requireContext(),R.raw.your_reality)
        var play = view.findViewById<Button>(R.id.Play)
        var pause = view.findViewById<Button>(R.id.Pausar)
        var detener = view.findViewById<Button>(R.id.Detener)

        play.setOnClickListener{
            cancion.start()
        }
        pause.setOnClickListener{
            cancion.pause()
        }
        detener.setOnClickListener{
            cancion.stop()
            cancion= MediaPlayer.create(requireContext(),R.raw.your_reality)
        }
    }

}