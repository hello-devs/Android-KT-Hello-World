package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

//ANDROID OS: Activity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val helloWorldText: TextView = findViewById<TextView>(R.id.helloWorldText) //nouvelle syntaxe Kotlin:
        helloWorldText.text = "Hello World from hello-devs"

        start_activity_green_btn.setOnClickListener {
            println("start activity green button clicked")
        }

    }
}