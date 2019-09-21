package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //while(){...}  /  do{...}while()  /  break


         //while
        var unreadEmailCount = 3

        while(unreadEmailCount > 0){
            println("Vérification des emails en cours...")
            println("Vous avez $unreadEmailCount non lus")
            unreadEmailCount--
        }

        println("--\n--")

        //do while
        unreadEmailCount = 0

        do{
            println("Vérification des emails en cours...")
            println("Vous avez $unreadEmailCount non lus")
            unreadEmailCount--
        }while(unreadEmailCount > 0)

        println("--\n--")

        //break
        unreadEmailCount = 3
        var notificationEnabled: Boolean = false

        do{
            println("Vérification des emails en cours...")
            if (!notificationEnabled) {
                break
            }
            println("Vous avez $unreadEmailCount non lus")
            unreadEmailCount--
        }while(unreadEmailCount > 0)

    }
}
