package com.example.imagen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val atras = findViewById<Button>(R.id.atras)
        val ratonboton = findViewById<ImageView>(R.id.ratonboton)
        ratonboton.setOnClickListener{
            Toast.makeText(this,"soy malvado muejeje", Toast.LENGTH_LONG).show()
        }

        atras.setOnClickListener{
            val intent = Intent(this@MainActivity4,MainActivity::class.java)
            startActivity(intent)
        }
    }
}