package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

//POO Cohabitation Kotlin - Java

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bob = User()
        bob.age = 5  //Kotlin detecte automatiquement les getters et setters
        bob.name = "Bob"

        Log.i("MainActivity", "L'adresse de bob est ${bob.address}")
    }
}