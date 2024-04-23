package com.example.reproductor

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val siguiente = findViewById<Button>(R.id.siguiente)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val elegir = resources.getStringArray(R.array.canciones)
        var adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,elegir)
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adaptador
        /*Se crea una variable para el boton siguiente y el spinner, con las opciones en la variable elegir que
        obtiene de una cadena de arrays en string de values y luego lo adapto en una variable adaptador
        y ese adaptador lo defino a mi spinner
        */

        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                /* Se crea un onItemSelected de mi spinner y creo las dos funciones obligatorias el onItemselected
                y onNoitemselected, en este caso solo uso onItemselected dentro creo un when para cada
                posible posicion del spinner y en cada uno el boton siguiente mandara a su respectiva
                interfaz
                */
                when(elegir[position]){
                    elegir[0]->{
                        siguiente.setOnClickListener{
                            val intent = Intent(this@MainActivity,Cancion::class.java)
                            startActivity(intent)
                        }
                    }
                    elegir[1]->{
                        siguiente.setOnClickListener{
                            val intent = Intent(this@MainActivity,Cancion2::class.java)
                            startActivity(intent)
                        }
                    }
                    elegir[2]->{
                        siguiente.setOnClickListener{
                            val intent = Intent(this@MainActivity,Cancion3::class.java)
                            startActivity(intent)
                        }
                    }
                    elegir[3]->{
                        siguiente.setOnClickListener{
                            val intent = Intent(this@MainActivity,Cancion4::class.java)
                            startActivity(intent)
                        }
                    }
                    elegir[4]->{
                        siguiente.setOnClickListener{
                            val intent = Intent(this@MainActivity,Cancion5::class.java)
                            startActivity(intent)
                        }
                }
            }

        }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
}
}