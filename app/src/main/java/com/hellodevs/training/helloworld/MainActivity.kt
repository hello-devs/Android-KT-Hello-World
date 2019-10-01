package com.hellodevs.training.helloworld


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//ANDROID OS: Parcelable (serialize/deserialize)

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    val user: User = User("bob",15)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        start_activity_green_btn.setOnClickListener {

            val intent = Intent(this, UserDetailActivity::class.java)

            intent.putExtra("user",user)

            startActivity(intent)
        }
    }
}

