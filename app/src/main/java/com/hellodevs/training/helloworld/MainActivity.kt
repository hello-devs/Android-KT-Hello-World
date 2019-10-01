package com.hellodevs.training.helloworld


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//ANDROID OS: Intent

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_activity_green_btn.setOnClickListener {

            val intent = Intent(this, GreenActivity::class.java)

            intent.action = Intent.ACTION_VIEW
            intent.addCategory("UserViewer")
            intent.putExtra("name", "bob")
            intent.putExtra("age", 15)

            startActivity(intent)
        }





    }
}

