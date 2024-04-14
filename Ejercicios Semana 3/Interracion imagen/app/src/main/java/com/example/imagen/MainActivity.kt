package com.example.imagen

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gatoboton = findViewById<ImageView>(R.id.gatoboton)
        gatoboton.setOnClickListener{
            Toast.makeText(this,"chipi chipi chapa chapa dubi dubi daba daba", Toast.LENGTH_LONG).show()
        }
        /* Creo una variable para interactuar con la imagen llamada gatoboton porque mi imagen es un gato
        del meme y creo un set on click y creo un toast, en el toast pongo la cancion y la duración
        sea larga al final el .show para que se muestre
        */
    }
}