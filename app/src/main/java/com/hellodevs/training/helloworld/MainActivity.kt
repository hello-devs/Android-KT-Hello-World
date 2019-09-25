package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//POO data Class
//Des méthodes sont auto-générées par Kotlin
data class User(val name: String, val age: Int){
    override fun toString(): String {               //On peut surcharger les fonction auto-générées
        return "name: $name - age: $age"
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bob = User("Bob", 10)
        println("Informations sur Bob:\n$bob")

        val bobette = User("Bobette", 4)
        println("Informations sur Bobette:\n$bobette")

        val john = bobette.copy(name = "john")      //fonction copy auto-générée par kotlin
        println("Informations sur John:\n$john")

        if (bobette == john){     //génération automatique de la fonctions equals() qui vérifie champs à champs
            println("Les utilisateurs sont identiques")
        } else {
            println("Les utilisateurs sont différents")
        }
    }
}