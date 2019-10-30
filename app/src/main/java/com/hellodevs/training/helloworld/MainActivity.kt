package com.hellodevs.training.helloworld

//Kotlin+ : High Order Function Lambda 2/2

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

fun arrayAction(array: Array<Int>, action: (Int)-> Unit){
    for (a in array){
        action(a)
    }

}

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers = arrayOf(-99, 56, - 39, 11, 23, 78, 66, 0, -1, -30)

        numbers.filter { number -> number > 0}
        //Si un seul parametre équivaut à:
        numbers.filter { it > 0 }

        arrayAction(numbers, {number -> println(number)})
        //Si lambda est le dernier paramètre équivaut à:
        arrayAction(numbers) { number -> println(number)}
        //En fonction kotlin équivaut à:
        numbers.forEach { println(it) }
        
        numbers.forEachIndexed { index, i -> println("index = $index, valeur = $i")  }
        //On peut ignorer un paramètre avec l'underscore
        numbers.forEachIndexed { _, i -> println("valeur = $i")  }

        //Dans ANDROID:
        val button = Button(this)

        ///////////////////////////////////////////////////////////////////
        button.setOnClickListener(object: View.OnClickListener{
            override fun onClick(view: View?) {
                println("click")
            }
        })
        //équivaut avec une lambda à:
        button.setOnClickListener { view -> println("click") }
        //On peut simplifier:
        button.setOnClickListener { println("Click") }
        ///////////////////////////////////////////////////////////////////////

    }
}




