package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//POO Companion Object(singleton)

abstract class Vehicle(val wheelsCount: Int){

    companion object Factory{                       //Le nommage n'est pas obligatoire
        fun createCar() = Car(4)
        fun createMotorcycle() = Car(2)
    }


}

class Car(wheelsCount:Int): Vehicle(wheelsCount)

class Motorcycle(wheelsCount:Int): Vehicle(wheelsCount)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car = Vehicle.createCar()
        val motorcycle = Vehicle.Factory.createMotorcycle()

    }
}