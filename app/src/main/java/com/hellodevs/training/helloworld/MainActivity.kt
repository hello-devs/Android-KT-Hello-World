package com.hellodevs.training.helloworld


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

//ANDROID OS: Dialog (modal)

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        show_dialog_button.setOnClickListener {

            val fragment = ConfirmDeleteDialogFragment()
            fragment.listener = object: ConfirmDeleteDialogFragment.ConfirmDeleteListener {
                override fun onDialogPositiveClick() {
                    Log.i(TAG,"onDialogPositiveClick")
                }

                override fun onDialogNegativeClick() {
                    Log.i(TAG, "onDialogNegativeClick")
                }

            }
            fragment.show(supportFragmentManager, "confirmDelete")
        }


    }
}

