package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hellodevs.training.helloworld.common.*       //import de variable
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //voir le fichier common/utils.kt

        println(name)
//      println(age)                                    //impossible privé

//        name2 = "Jul"                                 //impossible setter privé
        println(name2)

        describePerson()
    }
}
