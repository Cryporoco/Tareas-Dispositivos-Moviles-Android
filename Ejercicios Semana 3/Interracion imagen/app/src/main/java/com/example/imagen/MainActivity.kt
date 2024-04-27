package com.example.imagen

import android.content.Intent
import android.media.RouteListingPreference.Item
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.ItemTouchUIUtil

class MainActivity : AppCompatActivity() {
    lateinit var eleccion: Array<String>
    var posicion = 0
    /* variables globales para las opciones de nuestro spinner y luego poder usarlo en el save instant
    y saber en que posicion se quedo para que al regresar sea la misma
    */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val siguiente = findViewById<Button>(R.id.siguiente)
        val spinner= findViewById<Spinner>(R.id.spinner)
        eleccion = resources.getStringArray(R.array.imagenes)
        var adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,eleccion)
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adaptador
        /* Variables para el boton siguiente, el spinner y los elementos del spinner, también se crea un
        adaptador que es como se vera en el layout el spinner en este caso para abajo y el adaptador
        se lo asigno a mi spinner
         */
        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                /* Se crea un objeto para cuando seleccionemos un elemento del spinner la funcion por
                default onItemSelected y se crean sus parametros
                */
                if (savedInstanceState != null){
                    savedInstanceState.getString("eleccion ",eleccion[posicion])
                }
                /* Un if por si volvemos se quede la opcion seleccionada de antes aunque no me fuciono no
                sé como implementarlo bien
                 */
                when (eleccion[position]) {
                    eleccion[1] -> {
                        posicion = 1
                        siguiente.setOnClickListener {
                            val intent = Intent(this@MainActivity, MainActivity2::class.java)
                            startActivity(intent)
                        }
                    }

                    eleccion[0] -> {
                        posicion = 0
                        siguiente.setOnClickListener {
                            val intent = Intent(this@MainActivity, MainActivity3::class.java)
                            startActivity(intent)
                        }
                    }

                    eleccion[2] -> {
                        posicion = 2
                        siguiente.setOnClickListener {
                            val intent = Intent(this@MainActivity, MainActivity4::class.java)
                            startActivity(intent)
                        }
                    }
                }
                /*Un when para caso o elección de imagen que se haga en este caso 3 en cada uno
                 el boton siguiente nos mandara un main diferente y se guarda la posicion para el save instant
                */
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
            /* La segunda opcion preter minada para cuando se inicie el spinner no haya una opcion ya
            seleccionada puede hacer un hint como -- o nada en este caso no lo use
            */
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {

        outState.putString("eleccion",eleccion[posicion])
        super.onSaveInstanceState(outState)
    }
    /* funcion para guardar la posicion de eleccion para que al volver siga siendo la misma aunque
    como dije no se como implementarlo bien
     */
}