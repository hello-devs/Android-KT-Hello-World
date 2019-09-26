package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//POO Nested class

class Bag (itemsCount: Int){

    val items = arrayOfNulls<Item>(itemsCount)

    class Item(val weight: Int){
        fun showWeight(){
            println("Cet item pèse ${weight}kg")
        }
    }

}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bag = Bag(2)

        val firstItem = Bag.Item(50) //l'item n'est pas lié au sac

        bag.items[1] = Bag.Item(200)

        print("firstItem: ")
        firstItem.showWeight()

        print("bag.items[0]: null\n")
        bag.items[0]?.showWeight()

        print("bag.items[1]: ")
        bag.items[1]?.showWeight()

        bag.items[0] = firstItem        //On attribut l'item au sac
        print("bag.items[0] ")
        bag.items[0]?.showWeight()
    }
}