package com.hellodevs.training.helloworld

//Kotlin+ : Exception Preconditions require() check() 2/2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

fun validateName(name: String){
    require(name.isNotEmpty())  {"empty name!"}
    for (character in name){
        require(character.isLetter()) {"Invalid name: non letter character ($character)"}
    }
}

fun sendGift(user: User){
    require(user.email.isNotEmpty()) {"Email required"}
    check(user.state == User.State.ACTIVE) {"Invalid user state: ${user.state}"}
    println("sending gift to user: ${user.name} now!")
}

data class User(val name: String, val email: String){

    enum class State {
        NEW,
        ACTIVE
    }

    var state: State = State.NEW

    init {
        validateName(name)
    }
}

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        validateName("Jul")

//        val bobette = User("bob3773","bobette@mail.com")      //test require
        val bobette = User("bobette","bobette@mail.com")        //test check
        bobette.state = User.State.ACTIVE  //commenter pour tester l'exception
        sendGift(bobette)
    }
}




