package com.hellodevs.training.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//Kotlin Extension de fonction : run
/*
Combinaison de let et with
 */

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sb = StringBuilder()
        sb.append("Hello! ")
        sb.append("Kotlin")

        val sentence = sb.toString()
        println(sentence)

        val shorterSentence = StringBuilder().run {
            append("hello! ")
            append("rapide run()")
            toString()
        }
        println(shorterSentence)
    }
}




