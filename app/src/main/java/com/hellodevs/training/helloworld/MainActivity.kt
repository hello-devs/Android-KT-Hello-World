package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//POO Generics function

fun <T> printArrayInversed(array: Array<T>){  //Le type du tableau est générique (String, Int, Float...)

    val sb = StringBuilder()
    var separator = ""

    for (i in array.indices.reversed()){
        sb.append(separator)
        sb.append(array[i])

        separator = ", "
    }
    println(sb.toString())

}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val integers = arrayOf(1, 2, 3, 4)
        val strings: Array<String> = arrayOf("Hello", "World", "in", "Kotlin")

        printArrayInversed(integers)
        printArrayInversed(strings)

    }
}