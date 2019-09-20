package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


//Déclaration de fonction
fun isOldEnough(age: Int): Boolean {
    return  age >= 5
}

//Syntaxe courte fonction 1 ligne:
fun isOldEnough2(age: Int): Boolean = age >= 5

fun describePeople(age: Int, name: String, height: Float){
    val canPlaySentence = when (isOldEnough2(age)){
        true -> "peut jouer basketball"
        false -> "ne peut pas jouer basketball"
    }
    println("$name a $age ans et mesure ${height}m et $canPlaySentence")

}



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age = 5
        var name = "Jul"
        var height = 1.60F

        var canPlayBasket = isOldEnough(4)
        var canPlayBasket2 = isOldEnough2(10)

        println(canPlayBasket)
        println(canPlayBasket2)

        describePeople(age, name, height)

        age = 4
        name = "Martin"
        height = 1.10F

        describePeople(age, name, height)
    }
}
