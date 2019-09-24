package com.hellodevs.training.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//POO Encapsulation

open class Account(){

    protected var balance: Int = 0

    open fun operation(value: Int){
        balance += value
        var prefix = if(value >= 0) "+" else ""
        println("$prefix$value € sur le compte. Solde: $balance")
    }
}

class PositiveAccount : Account(){
    override fun operation(value: Int) {
        if(!isValidOperation(value)){
            println("Découvert non autorisé sur ce compte\"positive account\"")
            return
        }
        super.operation(value)
    }

    private fun isValidOperation(value: Int): Boolean{
        return 0 <= balance + value
    }
}


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Account:")
        val account = Account()
        account.operation(100)
        account.operation(-200)

        println("PositiveAccount:")
        val positiveAccount = PositiveAccount()
        positiveAccount.operation(50)
        positiveAccount.operation(-200)
        positiveAccount.operation(-20)

    }
}
