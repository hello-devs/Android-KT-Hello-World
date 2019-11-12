package com.hellodevs.training.helloworld

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hellodevs.training.helloworld.utils.isVisible
import com.hellodevs.training.helloworld.utils.toast
import kotlinx.android.synthetic.main.activity_main.*

//Kotlin Extension de fonction : Custom
/*
-Ajout de comportement a une classe existante
-Sans Modification de la classe
 */

//
fun User.canPlayBasketBall() = this.age >= 10
//Sur Companion Object
fun User.Companion.createBobby() = User("Bobby", 15)

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bob = User("bob",10)
        val bobette = User.createBobette()
        val bobby = User.createBobby()

        println("${bob.name.capitalize()} peut jouer au basket: ${bob.canPlayBasketBall()}")
        println("${bobette.name.capitalize()} peut jouer au basket: ${bobette.canPlayBasketBall()}")
        println("${bobby.name.capitalize()} peut jouer au basket: ${bobby.canPlayBasketBall()}")

        /////////////////////////////Dans ANDROID///////////////////////////////////////////////////
        if(hello_devs.visibility == View.VISIBLE){
            Toast.makeText(this, "hello devs est visible",Toast.LENGTH_SHORT).show()
        }
        //grâce aux extensions de Context et View dans Utils/viewUtils équivaut à
        if(hello_devs.isVisible()){
            toast("hello devs est visible")
        }

    }
}




