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

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val atras = findViewById<Button>(R.id.atras)
        val ranaboton = findViewById<ImageView>(R.id.ranaboton)
        ranaboton.setOnClickListener{
            Toast.makeText(this,"florcita para ti", Toast.LENGTH_LONG).show()
        }

        atras.setOnClickListener{
            val intent = Intent(this@MainActivity3,MainActivity::class.java)
            startActivity(intent)
        }
    }
}