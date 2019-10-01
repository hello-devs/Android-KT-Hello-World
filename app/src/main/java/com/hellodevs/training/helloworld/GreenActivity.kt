package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class GreenActivity : AppCompatActivity() {

    val TAG = "GreenActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_green)

        val action = intent.action
        val isUserViewer = intent.hasCategory("UserViewer")

        val extras: Bundle? = intent.extras  //Récupère les extras déclaré dans MainActivity dans un objet de type Bundle

        val name = extras?.getString("name")
        val age = extras?.getInt("age")

        Log.i(TAG,"""| 
                    |action: $action
                    |UserView: $isUserViewer
                    |name: $name
                    |age: $age""".trimMargin())

    }
}
