package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//POO Cast et verification de type

abstract class Vehicle(private val wheelsCount: Int) {
    fun showWheels() {
        println("Nombre de roues : $wheelsCount")
    }

    abstract fun honk()
}

interface Fuel {
    var fuelGauge: Double

    fun fillGasTank() {
        println("Remplissage du réservoir à essence...")
        fuelGauge = 100.0
    }

    fun displayGasGauge() {
        println("La jauge est à $fuelGauge %")
    }
}

interface Trick {
    fun wheeling()
}

class Car : Vehicle(4), Fuel {
    override var fuelGauge: Double = 0.0

    override fun honk() {
        println("Pouet!")
    }
}

class Motorcycle : Vehicle(2), Fuel, Trick {
    override var fuelGauge: Double = 0.0

    override fun honk() {
        println("Tsouin!")
    }

    override fun wheeling() {
        println("Roue arriere en moto !")
    }

    override fun fillGasTank() {
        super.fillGasTank()
        honk()
    }
}

class Bicycle : Vehicle(2), Trick {
    override fun wheeling() {
        println("Roue arrière en vélo !")
    }

    override fun honk() {
        println("Tut!")
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var v: Vehicle = Motorcycle()

//        if (v is Vehicle) {
        print("v est un Vehicle")       //sans ln pas de retour a la ligne dond print en 2 partie

        when (v) {
            is Car -> println(" de type Car")
            is Motorcycle -> println(" de type Motorcycle")
            is Bicycle -> println(" de type Bicycle")
        }
//        }

        //v.wheeling()
        if (v is Trick) {
            v.wheeling()
        } else {
            println("v ne peux pas faire de figure")
        }

        val bike: Bicycle? = v as? Bicycle
        bike?.wheeling()

        (v as? Bicycle)?.wheeling()  //sur une ligne
    }
}
