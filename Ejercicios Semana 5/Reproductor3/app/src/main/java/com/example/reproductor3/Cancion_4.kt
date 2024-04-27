package com.example.reproductor3

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class Cancion_4 : Fragment(R.layout.fragment_cancion_4) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var  cancion = MediaPlayer.create(requireContext(),R.raw.rat_river)
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
            cancion= MediaPlayer.create(requireContext(),R.raw.rat_river)
        }

    }
}