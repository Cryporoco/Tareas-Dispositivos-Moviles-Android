package com.example.reproductor

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Cancion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cancion)
        var  cancion = MediaPlayer.create(this,R.raw.ratriver)
        val atras = findViewById<Button>(R.id.atras)
        var play = findViewById<Button>(R.id.Play)
        var pause = findViewById<Button>(R.id.Pausar)
        var detener = findViewById<Button>(R.id.Detener)
        /* Variables para cada boton en la interfaz y uno para la cancion el cual nos pide el contexto el cual
        sería este por eso this y la ubicación que sería en la carpeta raw y se crea la variable atras
        para volver al main activity al tocarlo
         */
        play.setOnClickListener{
            cancion.start()
        }
        pause.setOnClickListener{
            cancion.pause()
        }
        detener.setOnClickListener{
            cancion.stop()
            cancion= MediaPlayer.create(this,R.raw.ratriver)
        }
        /* Funciones que al clickar un boton haga su respectiva función las cuales ya vienen con el android studio
        start para empezar la canción, pause para pararla, stop para que no se pueda reproducir de nuevo y para
        arreglar esto se reinicia la variable cancion poniendole de nuevo la cancion
        */
        atras.setOnClickListener{
            val intent = Intent(this@Cancion,MainActivity::class.java)
            startActivity(intent)
        }
        /* Se crea que al clickear en el boton atras volvamos a la primera interfaz o main acticity
        y en las demás canciones no escribire comentarios para no ser redundante porque escencialmente
        es lo mismo
        */
    }
}