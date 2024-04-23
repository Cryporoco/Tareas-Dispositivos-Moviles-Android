package com.example.reproductor

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Cancion2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cancion2)
        var  cancion = MediaPlayer.create(this,R.raw.yourreality)
        val atras = findViewById<Button>(R.id.atras)
        var play = findViewById<Button>(R.id.Play)
        var pause = findViewById<Button>(R.id.Pausar)
        var detener = findViewById<Button>(R.id.Detener)

        play.setOnClickListener{
            cancion.start()
        }
        pause.setOnClickListener{
            cancion.pause()
        }
        detener.setOnClickListener{
            cancion.stop()
            cancion= MediaPlayer.create(this,R.raw.yourreality)
        }

        atras.setOnClickListener{
            val intent = Intent(this@Cancion2,MainActivity::class.java)
            startActivity(intent)
        }
    }
}