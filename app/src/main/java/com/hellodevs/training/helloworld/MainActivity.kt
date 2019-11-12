package com.hellodevs.training.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.util.*

//Kotlin Extension de fonction : use
/*
Ferme une classe qui implement l'interface Closeable
 */

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val properties = Properties()
        with(properties){
            setProperty("name", "Bob")
            setProperty("age", "10")
        }

        val file = File("config.properties")

        /////////////Kotlin Style
        FileOutputStream(file).use { fileOutputStream ->
            properties.store(fileOutputStream, null)
        }

        val loadProperties = properties.apply {
            FileInputStream(file).use { load(it) }
        }

        /////////////Java Style
        var fileOutputStream : FileOutputStream? = null
        try {
            fileOutputStream = FileOutputStream(file)
            properties.store(fileOutputStream, null)
        }catch (e: IOException){

        }finally {
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close()
                }catch (e: IOException){

                }
            }
        }
        //.....
        /////////////////////////////////////////////////

    }
}




