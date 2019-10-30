package com.hellodevs.training.helloworld

//Kotlin+ : High Order Function 1/2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*

fun filterInts(numbers: Array<Int>, param: (Int) -> Boolean): Array<Int> {
    val filteredNumbers = mutableListOf<Int>()

    for (n in numbers) {
        if (param(n)) {
            filteredNumbers.add(n)
        }
    }

    return filteredNumbers.toTypedArray()
}

fun positiveInt(n: Int): Boolean = n > 0
fun evenInt(n: Int) : Boolean = (n % 2 == 0)

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers = arrayOf(-99, 56, - 39, 11, 23, 78, 66, 0, -1, -30)

        val positiveNumbers = filterInts(numbers, ::positiveInt)
        val evenNumbers = filterInts(numbers, ::evenInt)

        val positiveEvenNumbers = filterInts(
            filterInts(numbers, ::positiveInt), ::evenInt
        )

        println("Nombre entiers ${positiveNumbers.contentToString()}")
        println("Nombre pairs ${evenNumbers.contentToString()}")
        println("Nombre entiers pairs  ${positiveEvenNumbers.contentToString()}")

    }
}




