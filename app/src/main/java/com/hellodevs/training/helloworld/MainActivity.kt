package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//POO lateinit
//Conditions: membre d'une classe && pas dans le constructeur primaire && pas primitive &&

class User(val name: String, val age: Int){

    lateinit var nickname: String
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val john = User("John", 15)

        john.nickname = "JFK"
        println("Surnom de John: ${john.nickname}")

    }
}