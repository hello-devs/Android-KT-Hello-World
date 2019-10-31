package com.hellodevs.training.helloworld

//Kotlin+ : Exception Throw Try/Catch/Finally 1/2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

fun divide(numerator: Int?, denominator: Int?) : Int {
    return numerator!! / denominator!!
}

////////////////////////////////////////////////////
class DivideException(message: String, cause: Exception)
    : Exception(message, cause)

fun divideWithDivideException(numerator: Int?, denominator: Int?) : Int {
    try {
        return numerator!! / denominator!!
    }catch (e: NullPointerException ){
        throw DivideException("Opérande Null", e)
    } catch (ae: ArithmeticException){
        throw DivideException("Division par 0 interdite", ae)
    }
}

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numerator : Int? = 10
        val denominator = 0

        try {
            println("Début de l'opération...")
            divide(numerator, denominator)
            println("Opération effectuer avec succès")
        }catch (e: NullPointerException){
            println("${e.message}, cause: ${e.cause}")
        }catch (ae: ArithmeticException){
            println("${ae.message}, cause: ${ae.cause}")
        }finally {
            println("Fin de l'opération")
        }

        /////////////////////////////////////////////

       try {
           println("Opération 1:")
           divideWithDivideException(10, 1)
           //divideWithDivideException(10, 0)  //test erreur
           println("Opération 2:")
           divideWithDivideException(null, 10)
           println("Opérations effectuer avec succès")
       }catch (de: DivideException){
           println("${de.message}, cause: ${de.cause}")
       }finally {
           println("Fin des opérations")
       }







    }
}




