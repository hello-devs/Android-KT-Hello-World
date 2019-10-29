package com.hellodevs.training.helloworld

//Kotlin+ : Sealed Class
/*
Ensembe de hierarchie de classe
abstraite + membres abstraits
Nombre d'enfants fixe et déclaré dans la classe
Plusieurs instance possible de l'enfants
*/


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(){

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age = execute(15, Operation.Add(3))
        println("Addition: age = $age")
        age = execute(age, Operation.Subtract(3))
        println("Soustraction: age = $age")
        age = execute(age, Operation.Increment)
        println("Incrementation: age = $age")
        age = execute(age, Operation.Decrement)
        println("Decrementation: age = $age")

    }
}




