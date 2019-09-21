package com.hellodevs.training.helloworld.common

var name = "Bob"            //la variable peut être importée et modifiée

var name2 = "Bobette"
    private set             //la variable peut être importée et modifiée

private var age = 10        //cette variable ne peut être importée

fun describePerson(){
    name2 = "Boby"
    println("Le nom de la personne est $name2 et elle a $age ans")
}