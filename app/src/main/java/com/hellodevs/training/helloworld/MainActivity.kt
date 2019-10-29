package com.hellodevs.training.helloworld

//Kotlin+ : Enum Class

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

enum class Direction(val description: String){
    NORTH("NORD"){
        override fun action() = "marcher"
    },
    EAST("EST"){
        override fun action() = "courrir"
    },
    SOUTH("SUD"){
        override fun action() = "danser"
    },
    WEST("OUEST"){
        override fun action() = "sauter"
    };

    abstract fun action(): String

    override fun toString(): String {
        return "name: $name (description= $description), action: ${this.action()}"
    }
}

fun logAction(windDirection: Direction){
    val action = when(windDirection){
        Direction.NORTH -> "marcher"
        Direction.EAST -> "courir"
        Direction.SOUTH -> "danser"
        Direction.WEST -> "sauter"
    }

    println("Vent du ${windDirection.description}, action = $action")

    println("Direction.action() -> ${windDirection.action()}")
}


class MainActivity : AppCompatActivity(){

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Test instance, functions,
        val windDirection = Direction.NORTH
        logAction(windDirection)

        //Test  name, ordinal
        val southName = Direction.SOUTH.name
        val southOrdinal: Int = Direction.SOUTH.ordinal
        println("Direction.name: $southName")
        println("Direction.ordinal: $southOrdinal")

        //Instantiation with name, ordinal
        val southDirection = Direction.valueOf(southName)
        val southDirectionFromOrdinal = Direction.values()[southOrdinal]

        //Parcours
        for(direction in Direction.values()){
            println(direction)
        }



    }
}




