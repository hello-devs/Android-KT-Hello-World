package com.hellodevs.training.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_green.*

class GreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_green)

        start_activity_main.setOnClickListener {
            println("start activity main button clicked")

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
