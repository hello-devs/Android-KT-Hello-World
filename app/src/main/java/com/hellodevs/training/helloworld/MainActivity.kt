package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age: Int = 5
        var name: String = "Jul"
        var height: Float = 1.60F

        //Controle de flux if else
        if(age < 5){
            println("${name} est trop jeune pour jouer au basket!")
        } else {
            println("${name} peut jouer au basket! \n de plus il mesure $height")
        }

        if("Bob" == name)
        {
            println("${name} est un garçon")
        } else if ("nathalie" == name){
            println("${name} est une fille")
        } else {
            println("On ne connait pas le sexe de ${name}")
        }

        //Operateur ternaire
        println("-----")

        val type = if (age < 18) "mineur" else "majeur"
        println(type)

        //Controle de flux when
        println("-----")
        when (age){
            5 -> println("${name} a ${age} ans")
            10 -> println("${name} a ${age} ans")
            18 -> println("${name} est ${age} ans")
            else -> println("On ne connait pas l'age de ${name}")
        }

        println("--")

        when{
            "Bob" == name ->println("${name} est un garçon")
            "nathalie" == name -> println("${name} est une fille")
            else  -> println("On ne connait pas le sexe de ${name}")
        }

        println("--")
        //Intervale
        when (age){
            in 0..17 -> println("${name} est mineur")
            !in 0..17-> println("${name} ne peut pas jouer avec les enfants")
            else -> println("Condition non gérée")
        }

        //attribution
        val canPlayWithChild = when (age){
            in 0..17 -> true
            else -> false
        }
        println(canPlayWithChild)


    }
}
