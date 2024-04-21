package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.processNextEventInCurrentThread
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(){
    var tipode = 0
    var num1: Double = 0.0
    var num2: Double = 0.0
    lateinit var resultado: TextView

    /* Variables globales
       Estas son variables globales para verificar que operación queremos con la variable "tipode"
       num1 y num2 para guardar los dos números que se pongan y por último es la variable
       resultado con lateinit que es cuando queremos iniciar una variable que tenga que ver con
       xml y sea global para que al ejecutar no se cierre la aplicación apenas abrirla en el celular
    * */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultado = findViewById<TextView>(R.id.resultado)
        var igual = findViewById<Button>(R.id.igual)
        var clear = findViewById<Button>(R.id.clear)
        if (savedInstanceState != null){
            resultado.setText(savedInstanceState.getString("resultado",""))
        }
        /* Un if para que al voltear la pantalla no se pierda datos si tenia al voltear
         pongo el textview resultado con la instancia guardada llamada resultado*/

        clear.setOnClickListener {
            resultado.setText("")
            tipode = 0
            num1 = 0.0
            num2 = 0.0
        }
        igual.setOnClickListener {
            num2 = resultado.text.toString().toDouble()
            var respuesta: Double = 0.0
            when (tipode) {
                1 -> {
                    respuesta = num1 + num2
                }
                2 -> {
                    respuesta = num1 - num2*(-1)
                }
                3 -> {
                    respuesta = num1 * num2
                }
                4 -> {
                    if (num2 == 0.0){
                        resultado.setText("No se divide entre 0")
                    }
                    else{
                        respuesta = num1 / num2
                    }

                }
            }
            resultado.setText(respuesta.toString())
        }
    }

    /* En la funcion OnCreate iniciaremos nuestra variable resultado que es la pantalla donde se veran los
    números y sus respuestas como tambien creamos las variables clear e igual, la varibale clear al tocar
    nos limpiara la pantalla y las variables poniendo en 0. En la variable igual se crea la variable respuesta
    y se le asigna un valor a num2 y se seleccionara el tipo de operación seleccionada al final dando como
    respuesta nuestra variable resultado, en el caso de la resta se le multiplica por un negativo porque
    sino daría una la suma porque negativo por negativo es más
     */
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("resultado", resultado.text.toString())
        super.onSaveInstanceState(outState)
    }
/* Funcion para guardar datos si se pusieron en el textview resultado al girar el celular se llama resultado
 para evitar confución y lo transormo a texto y luego string para guardarlo correctamente*/
    fun presionarnum(view: View) {
        var numshow = resultado.text.toString()
        when (view.id) {
            R.id.num1 -> {
                resultado.setText(numshow + "1")
            }
            R.id.num2 -> {
                resultado.setText(numshow + "2")
            }
            R.id.num3 -> {
                resultado.setText(numshow + "3")
            }
            R.id.num4 -> {
                resultado.setText(numshow + "4")
            }
            R.id.num5 -> {
                resultado.setText(numshow + "5")
            }
            R.id.num6 -> {
                resultado.setText(numshow + "6")
            }
            R.id.num7 -> {
                resultado.setText(numshow + "7")
            }
            R.id.num8 -> {
                resultado.setText(numshow + "8")
            }
            R.id.num9 -> {
                resultado.setText(numshow + "9")
            }
            R.id.num0 -> {
                resultado.setText(numshow + "0")
            }
            R.id.punto -> {
                resultado.setText(numshow + ".")
            }
        }
    }

    /*La función presionarnum sirve que al presionar un número en el teclado este aparesca en la pantalla
    y con la variable numshow vamos guardando los números para que cuando toquemos otro no desaparezca el anterior
    en la interfaz a los botones les asignamos esta funcion y así al tocar se idetifican con el id que le puse
     */

    fun presionarsigno(view: View) {
        num1 = resultado.text.toString().toDouble()
        resultado.setText("")
        var signoshow = resultado.text.toString()
        when (view.id) {
            R.id.suma -> {
                resultado.setText(signoshow + "+")
                tipode = 1
            }
            R.id.resta -> {
                resultado.setText(signoshow + "-")
                tipode = 2
            }
            R.id.multiplicacion -> {
                resultado.setText(signoshow + "*")
                tipode = 3
                resultado.setText("")
            }
            R.id.division -> {
                resultado.setText(signoshow + "/")
                tipode = 4
                resultado.setText("")
            }
        }
    }
}


/* En la función presionarsigno es parecido al precionarnum solo que con los signos y al clickar uno
la variable tipode se asigne un valor para poder llamar asi a la operacion en el OnCreate, también se 
le asiga un valor un valor a num1 transformando el texto anterior en un Double y borramos la pantalla 
para hacer lo mismo con el num2, en el caso de la multiplicación y división se borra la pantalla
porque sino transformamos el signo  y quedaría ** o // en el código crasheando la app, siendo
raro que no pase con la suma o resta
*/