package com.hellodevs.training.helloworld

import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//Kotlin Extension de fonction : with

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val paint = Paint()
        paint.alpha = 100
        paint.color = Color.RED
        paint.strokeWidth = 2.0f

        //équivaut à
        with(paint){
            alpha = 100
            color = Color.BLUE
            strokeWidth = 1.0f
        }


    }
}




