package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//POO héritage de class

open class Vehicle(val wheelsCount: Int) {   //Le mot clef open permet de rendre la classe heritable

    open fun describeVehicle(){
        println("Ce véhicule a $wheelsCount roues")
    }
}

class Car: Vehicle(4)

class Motorcycle: Vehicle(2)
{
    val vehicleName = "moto"

    override fun describeVehicle() {
        println("Ce véhicule a $wheelsCount roues c'est une $vehicleName")
    }
}


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val vehicle1 = Car()
        vehicle1.describeVehicle()

        val vehicle2: Vehicle = Motorcycle()
        vehicle2.describeVehicle()


    }
}
