package com.example.imagenes3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().apply {
            add(R.id.spinner,Spinner())
            commit()
            /*
            Manera mixta de agregar fragmentos a la acividad principal en este caso yo use más el editor
            del layout, pero lo agregue para no olvidarme de que se puede combinar.
             */
        }
    }
}