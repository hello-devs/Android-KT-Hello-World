package com.hellodevs.training.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.io.File

//Kotlin Extension de fonction : let

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var file = File("config")
//        if (file.exists()){
//
//        }

        //Restreint au bloc
        File("config").let { file ->
            if (file.exists()){
                println("$file existe")
            }else{
                file.createNewFile()
                println("$file fichier crée")
            }
        }

        //Remplace un if
        var file: File? = null
//        file = File("test") //non null

        file?.let { file ->
            println("$file n'est pas null")
        }

    }
}




