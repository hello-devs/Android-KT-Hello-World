package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//POO Inner class
//L'Inner class a accès aux méthodes et variables membres de l'Outer class
//Elle est dépendante de l'Outer class contrairement au Nested class
class Car (val wheelsCount: Int){


    inner class Engine {
        fun displayHorsePower(){
            println("Cette voiture à ${wheelsCount * 16 }chevaux")
        }
    }

}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car = Car(4)
        val engine = car.Engine()
        engine.displayHorsePower()


    }
}