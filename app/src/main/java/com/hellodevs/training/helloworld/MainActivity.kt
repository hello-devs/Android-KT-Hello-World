package com.hellodevs.training.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//Kotlin+ : Collection Set 2/3

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uniqueNames = mutableSetOf("Bob","Bobette")
        println(uniqueNames)

        uniqueNames.add("Joseph")
        uniqueNames.add("Joe")
        uniqueNames.add("Jane")
        uniqueNames.add("Bob") //Pas de changement: déjà présent
        println(uniqueNames)
        println("Bob est il présent? ${uniqueNames.contains("Bob")}")

        val roUniqueNames: Set<String> = uniqueNames //Non mutable

        println("élément à l'indice 0: ${roUniqueNames.elementAt(0)}") //!!!Pas fiable dans un set

        val list: List<String> = roUniqueNames
            .filter { it.startsWith("J") }
            .sorted() //trie par ordre alphabetic
        println(list)




    }
}




