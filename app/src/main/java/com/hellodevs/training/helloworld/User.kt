package com.hellodevs.training.helloworld

data class User(val name: String, val age: Int) {

    companion object {
        fun createBobette() = User("Bobette",9)
    }

}