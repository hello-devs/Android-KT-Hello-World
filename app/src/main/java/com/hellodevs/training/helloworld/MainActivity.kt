package com.hellodevs.training.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

//ANDROID+ Ressource Qualifiers i18n, pluriels, formatage de chaînes
/*
Permet de définir les cas d'utilisation des resources
 */
class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        label_flour.text = getString(R.string.label_flour, 300)

        val eggCount = 2
        label_eggs.text = resources.getQuantityString(R.plurals.number_of_eggs, eggCount, eggCount)

    }


}




