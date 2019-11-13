package com.hellodevs.training.helloworld

import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

//ANDROID+ Context et Application
/*
Classe abstraite local (ex: Activity) ou global (ex:Application)
Si Objet attaché à la vie de l'activity utiliser context activity
Si Objet attaché à la vie de l'application utiliser context application (ex connection a une bdd)
 */
class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "onCreate()")

        val textViewActivity = TextView(this)
        textViewActivity.text = "Activity Context"
        textViewActivity.textSize = 30f

        val textViewApp = TextView(applicationContext)
        textViewApp.text = "Application Context"
        textViewApp.textSize = 30f

        val layout: LinearLayout = root
        layout.addView(textViewActivity)
        layout.addView(textViewApp) //Le theme ne sera pas appliqué
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy()")
    }
}




