package com.hellodevs.training.helloworld


import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

//ANDROID OS: Logcat

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v(TAG,"Verbose message")
        Log.d(TAG,"Debug message")
        Log.i(TAG,"Info message")
        Log.w(TAG,"Warning message")
        Log.e(TAG,"Error message")
        Log.println(Log.ASSERT,TAG,"Assert message")

        val testLogger = TestLogger()
        testLogger.myTestFunc()


    }
}

class TestLogger {

    val TAG = TestLogger::class.java.simpleName //Renvoi le nom de la class

    fun myTestFunc(){
        Log.i(TAG, "myTestFunc message")
    }
}