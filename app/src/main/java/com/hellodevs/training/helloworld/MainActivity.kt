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

        val names = Array<String>(3) {""}
        names.set(0, "Bob")
        names[1] = "John"

        //Factoy Function
        val ages= arrayOf(4, 7, 15, 35, 44, 55)

        //Boucle For

        //For avec range
        for (i in 1..5){
            println(i)
        }

        println("--")

        //For avec range et step
        for (i in 1..5 step 2){
            println(i)
        }

        println("--")

        //For avec range (downto)
        for (i in 5 downTo 1){
            println(i)
        }

        println("--")

        //For avec range (downto)
        for (i in 5 downTo 1 step 2){
            println(i)
        }

        println("--")

        //foreach
        for (age in ages){
            println(age)
        }

        println("--")

        //foreach avec index
        for ((index, age) in ages.withIndex()){
            println("$age est a l'index $index")
        }

        //continue
        for (age in ages){
            if(age == 44) {
                println("On affiche ceci puis on passe au tour de boucle suivant")
                continue
            }
            println(age)
        }

    }
}
