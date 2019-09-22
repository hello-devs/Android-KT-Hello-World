package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Intro POO déclaration de class

class Car(val wheelsCount: Int){
    fun honk(){
        println("buzz")
    }

    fun honkForWheels(){
        println("honkForWells")

        for(i in 1..wheelsCount){
            honk()
        }
    }
}



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val car = Car(4)
        println("la voiture a ${car.wheelsCount} roues")

        car.honk()
        car.honkForWheels()
    }
}
