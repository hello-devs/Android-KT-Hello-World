package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//POO constructeur de class

class User(
    val name: String,
    val age: Int,
    val height: Float
) {

    val canPlayBasketball = age >= 5 && height >= 1.50f

    init {
        val basketString = when (canPlayBasketball) {
            true -> "est dans l'équipe de basketball"
            false -> "ne peut pas jouer au basketball"
        }
        println("$name a $age ans et $basketString")

    }
    constructor(name: String): this(name, 5, 1.2f)

}


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jerome = User("Jérome", 15, 1.85f)  //
        val bobette = User("Bobette")                       //Fait appel au construceur sec pour les valeur manquante
    }
}
