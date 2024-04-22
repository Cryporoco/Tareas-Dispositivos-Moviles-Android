package com.example.imagen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val atras = findViewById<Button>(R.id.atras)
        val gatoboton = findViewById<ImageView>(R.id.gatoboton)
        gatoboton.setOnClickListener{
            Toast.makeText(this,"chipi chipi chapa chapa dubi dubi daba daba", Toast.LENGTH_LONG).show()
        }
        /* Creo una variable para interactuar con la imagen llamada gatoboton porque mi imagen es un gato
        del meme y creo un set on click y creo un toast, en el toast pongo la cancion y la duración
        sea larga al final el .show para que se muestre. Así con todas las demás imagenes por lo que no
        lo comentare para no ser repetitivo
        */
        atras.setOnClickListener{
            val intent = Intent(this@MainActivity2,MainActivity::class.java)
            startActivity(intent)
        }
        /* Cree un boton para ir atras y al hacer click en el por la variable intent ubicamos la actividad
        y a donde queremos ir y luego la iniciamos con el startactivity y como en el toast no
        lo mencionare en los demás para no ser repetitivo
        */
    }
}