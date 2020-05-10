package com.hellodevs.training.helloworld

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class BlueFragment : Fragment() {

    val TAG = "BlueFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG,"onCreate()")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG,"onAttach()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG,"onDetach()")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.i(TAG,"onCreateView()")
        return inflater.inflate(R.layout.fragment_blue, container, false)
    }
}