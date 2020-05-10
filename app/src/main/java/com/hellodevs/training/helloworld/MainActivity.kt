package com.hellodevs.training.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

//ANDROID+ Fragments : cycle de vie
/*
Permet de définir les cas d'utilisation des resources
 */
class MainActivity : AppCompatActivity(), GreenFragment.GreenFragmentListener {

    val TAG = "MainActivity"

    private lateinit var greenFragment: GreenFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Création instance GreenFragment
        greenFragment = GreenFragment()
        greenFragment.listener = this

        supportFragmentManager.beginTransaction()
            .add(R.id.container, greenFragment)
            .commit()


    }

    override fun onClick() {
        val blueFragment = BlueFragment()

        supportFragmentManager.beginTransaction()
//            .remove(greenFragment)
//            .add(R.id.container, blueFragment)
            .replace(R.id.container, blueFragment) //meme effet que les lignes précédentes
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN) //Ajoute une transition (léger fondu)
            .addToBackStack(null) //Permet le retour sur le fragment précédent en exécutant la transaction a l'envers
            .commit()

    }


}




