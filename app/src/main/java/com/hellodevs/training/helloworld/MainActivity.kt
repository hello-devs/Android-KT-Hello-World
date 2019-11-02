package com.hellodevs.training.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//Kotlin+ : Collection List 1/2

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers = mutableListOf<Int>(1, 2, 3)
        numbers.add(42)
        numbers.add(8)

        val roNumbers: List<Int> = numbers
        //roNumbers.add() n'existe pas pour une list immutable

        val evenNumbers = numbers.filter { it % 2 == 0 }
        println(evenNumbers)

        val names = listOf("Bob", null, "Bobette", null, "Mike")
        println(names)

        val longNames = names.filterNotNull()
            .filter { it.length > 3 }
            .map { it.toUpperCase() }
        println(longNames)

        val containsLetterM : Boolean = names
//            .take(3)  //renvoi false
            .filterNotNull()
            .any { it.toLowerCase().contains("m") }
        println("Au moins un nom contient la letter \"m\": $containsLetterM")

    }
}




