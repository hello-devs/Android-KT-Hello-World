package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TABLEAU

        //Syntaxe constructeur
        val array :Array<Int> =  Array<Int>(3) { 0 }
        println(Arrays.toString(array))

        val names = Array<String>(3) {""}
        names.set(0, "Bob")
        names[1] = "John"
        println(names.get(0))
        println(names[1])

        //Factoy Function
        val ages= arrayOf(4, 7, 55)
        println("le troisieme élément est ${ages[2]}")


    }
}
