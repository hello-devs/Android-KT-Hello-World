package com.hellodevs.training.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//Kotlin+ : Collection Map 3/3

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languages = mutableMapOf(
            "Kotlin" to "Un super langage",
            "Java" to "Un langage qui a fait son temps"
        )
        languages.put("C++","Une des origines du Java")
        languages["C#"] = "Une dérivé du C"
        println(languages)
        println("valeur de la clef \"Ktolin\": ${languages["Kotlin"]}" )

        if (!languages.containsKey("Python")){
            println("Python n'est pas présent!")
        }

        for (key in languages.keys){
            println("Clef: $key")
        }
        
        for (entry in languages.entries){
            println("Clef: ${entry.key} => Valeur: ${entry.value} ")
        }

        for ((key, value) in languages){
            println("Clef: $key ===> Valeur: $value ")
        }

        val nonCppLanguages = languages
            .filterNot { it.key == "C++" } //équivaut à filter { it.key != "C++" }
            .mapValues { it.value.toUpperCase() }

        println("nonCppLanguages: $nonCppLanguages")
    }
}




