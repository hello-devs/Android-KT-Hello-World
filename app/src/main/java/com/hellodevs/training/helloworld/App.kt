package com.hellodevs.training.helloworld

import android.app.Application
import android.util.Log

class App: Application() {

    private val TAG = "App"

    override fun onCreate() {
        super.onCreate()
        Log.i(TAG,"onCreate()")
    }

}