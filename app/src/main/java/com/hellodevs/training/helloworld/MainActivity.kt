package com.hellodevs.training.helloworld

//Kotlin+ : Elvis Operator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.lang.IllegalArgumentException

data class User(var name: String?, var email: String?){

    fun updateName(name: String?){
        this.name = name ?: "NoName"
    }

    fun updateEmail(email: String?){
        this.email = email ?: throw IllegalArgumentException("Invalid Email")  //Permet aussi de jeter des exception
    }

    fun getInfoLength() {
        val nameLength = name?.length ?: 0
        val emailLength = email?.length ?: 0
        val infoLength = nameLength + emailLength
        println("Info length: $infoLength")
    }
}

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: String? = "Bob"

        val size = if (name != null) name.length else 0
        //équivaut à:
        val sizeElvis = name?.length ?: 0

        val bob = User("bob", null)
        bob.updateName(null)
        println(bob)

        bob.updateName("bob")
        bob.updateEmail("bob@mail.com")
        println(bob)

//        bob.updateEmail(null) //Throw Exception
        bob.getInfoLength()


    }
}




