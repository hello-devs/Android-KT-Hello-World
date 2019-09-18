package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age: Int = 10
        var name: String = "Bob"

        println("string template simple: $name a $age ans")
        println("string template complexe: ${name.toUpperCase()} a ${age + 5} ans")
        println("Concatenation: \n"
                + name + " a " + age + "ans")

        println("""Raw string: 
Nom: $name
Age: $age
        """)

        println("""Raw string trim:
            |Nom: $name
            |Age: $age
        """.trimMargin())

        println("""Raw string trim2:
            >Nom: $name
            >Age: $age
        """.trimMargin(">"))

    }
}
