package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_green.*

class UserDetailActivity : AppCompatActivity() {

    val TAG = "UserDetailActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_green)

        val user = intent.getParcelableExtra<User>("user")  //On récupère,réinstancie l'objet

        name.text = "Nom: ${user.name}"
        age.text = "Age: ${user.age}"

    }
}
