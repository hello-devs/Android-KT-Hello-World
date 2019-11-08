package com.hellodevs.training.helloworld

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

//Kotlin+ : const
/*
-Déclaration en dehors d'une classe ou dans un companion object
-La différence avec val seul: la valeur est assignée à la compilation (avant le lancement de l'app)
-De type primitif
 */

//Déclaration en dehors de classe
const val VERSION : Int = 42
const val NAME : String = "Bob"

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    //Déclaration en companion object
    companion object{
        const val TEST = "TEST OK!"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val localVersion = VERSION
        val localTest = MainActivity.TEST



    }
}




