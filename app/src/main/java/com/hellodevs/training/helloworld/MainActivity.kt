package com.hellodevs.training.helloworld

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

//Kotlin+ : Lazy init
/*
Variable immutable initialisée lors de sa premiere utilisation
 */

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    val helloDevsLazy: TextView by lazy {
        println("lazy init")
        hello_devs
    }

    lateinit var helloDevsLate : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Lazy: ${helloDevsLazy.text}")  //Première appel init de la variable

//        helloDevsLate = hello_devs

    }

    override fun onResume() {
        super.onResume()
        println("Lazy: ${helloDevsLazy.text}")  //Deuxième appel la variable a déjà été init
//        println("Late: ${helloDevsLate.text}")  //Génère une exception si on oublie d'initialiser
    }
}




