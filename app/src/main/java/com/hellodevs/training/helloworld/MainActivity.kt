package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//POO Generics class
//On peut restreindre à des types spécifique : <T: Number>

class Box<T> (var value: T){

    fun set(newValue: T){
        value = newValue
    }

    fun get(): T{
        return value
    }

}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boxInt = Box<Int>(2)
        val v: Int = boxInt.get()
        println("Box value: $v")

        val boxString = Box<String>("Kotlin")
        println("Box value: ${boxString.get()}")
        boxString.set("Java")
        println("Box value: ${boxString.get()}")

    }
}