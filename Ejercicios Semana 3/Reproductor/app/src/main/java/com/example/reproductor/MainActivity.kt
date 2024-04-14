package com.example.reproductor

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var  cancion = MediaPlayer.create(this,R.raw.ratriver)
        var play = findViewById<Button>(R.id.Play)
        var pause = findViewById<Button>(R.id.Pausar)
        var detener = findViewById<Button>(R.id.Detener)
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
        }
        /* Funciones que al clickar un boton haga su respectiva función las cuales ya vienen con el android studio
        start para empezar la canción, pause para pararla y stop para que no se pueda reproducir de nuevo
        */
    }
}