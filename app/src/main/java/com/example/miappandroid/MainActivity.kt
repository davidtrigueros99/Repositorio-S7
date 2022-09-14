package com.example.miappandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //saludo()
        //println("hola")

        //variableyConstantes()

        //ejercicioVarVal()

        tiposDeDatos()
        tiposDeDatosDeducidosExplicitos()
    }
    /*
    fun saludo(){
        println("Hola mundo desde la funcion saludo")
    }
    */
    private fun variableyConstantes(){
        //variables
        var miPrimeraVariable = "Hola estudiantes de ingenieria"
        println(miPrimeraVariable)

        miPrimeraVariable = "Aqui cambiamos el valor de la variable"
        println(miPrimeraVariable)

        //constante
        val miPrimeraConstante = "Esto es una constante"
        println(miPrimeraConstante)

        val miSegundaConstante:String = miPrimeraVariable
        println(miSegundaConstante)

        var miNumero = 1
        var miDouble = 2.2
    }

    private fun ejercicioVarVal(){
        println("Hola Alumnos")
        val nombre:String = "Pedro"

        var apellido:String = "Rodrigues"
        apellido = "Rodriguez"

        var edad:Int = 21
        edad = 22

        var salario = 1200
        salario = 1220

        var nombreCompleto = nombre + " " + apellido
        println(nombreCompleto)

        val anioNacimiento = 2000
        var anioActual = Calendar.getInstance().get(Calendar.YEAR)
        var Edad = anioActual - anioNacimiento
        println("Tu edad es: $Edad")
    }

    private fun tiposDeDatos(){
        //Enteros(Byte, Short, Int, Long)
        val miInt = 1
        val miInt2:Int = 3
        val miInt3:Int = miInt + miInt2
        println(miInt3)

        //Decimales(Float, Double)
        val miFloat = 1.7f
        val miFloat2:Float = 1.7f
        val miDouble = 1.3
        val miDouble2:Double = 1.4
        val miDouble3:Double = 5.0
        val miSumaDouble = miDouble + miDouble2 + miDouble3
        println(miSumaDouble)

        //boolean (bool)
        val miBoolean:Boolean = true
        val miBoolean2 = false
        val miBoolean3:Boolean = true
        println(miBoolean == miBoolean2)
        println(miBoolean && miBoolean2)
    }

    private fun tiposDeDatosDeducidosExplicitos(){
        //tipos de datos
        var enteroExplicito:Int = 45
        println(enteroExplicito.javaClass)
        var enteroDeducido = 35
        println(enteroDeducido.javaClass)

        //Double
        var dobleExplicito:Double = 45.45
        println(dobleExplicito.javaClass)
        var dobleDeducido = 35.35
        println(dobleDeducido.javaClass)

        //Float
        var floatExplicito:Float = 45.45f
        println(floatExplicito.javaClass)
        var floatDeducido = 35.35f
        println(floatDeducido.javaClass)

        //Long
        var largoExplicito:Long = 454545
        println(largoExplicito.javaClass)
        var largoDeducido = 353535L
        println(largoDeducido.javaClass)

        //String
        var textoExplicito:String = "45"
        println(textoExplicito.javaClass)
        var textoDeducido = "35"
        println(textoDeducido.javaClass)

        enteroExplicito = textoExplicito.toInt()
        println(enteroExplicito.javaClass)
        enteroDeducido = textoDeducido.toInt()
        println(enteroDeducido.javaClass)
    }
}