package com.hellodevs.training.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.io.File

//Kotlin Extension de fonction : apply

data class User(var name: String = "", var age: Int = 0)

fun createDirectory(path: String) : File{
    val file = File(path)
    file.mkdir()
    return file
}

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Ex1
        val longUser = User()
        longUser.name = "LongBob"
        longUser.age = 15

        val shortUser = User().apply {
            name = "ShortBob"
            age = 5
        }

        //Ex2
        //En déclarant un fct
        val longHome = createDirectory("longHome")
        //Sans utiliser la fct:
        val shortHome = File("shortHome").apply { mkdir() }

    }
}




