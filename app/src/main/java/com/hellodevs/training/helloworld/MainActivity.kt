package com.hellodevs.training.helloworld


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

//ANDROID OS: Composant de l'interface

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview.setOnClickListener {
            Log.i(TAG,"textview a été cliqué")
        }


    }
}

