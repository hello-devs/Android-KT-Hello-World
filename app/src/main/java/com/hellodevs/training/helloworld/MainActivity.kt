package com.hellodevs.training.helloworld


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


//ANDROID OS: Theme
class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}

