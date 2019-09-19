package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Mutable / Immutable / Nullable

        //Mutable: var
        var age = 5

        //Immutable: val
        val ageMinimum = 18

        //Nullable
        var name: String? = "Bob"
        name = null

        if (name != null) {println(name.length)} //TEST
        println(name?.length)  //Safe call Operator
        //println(name!!.length)  //assert non-null Operator: accede meme si null et plante si null


    }
}
