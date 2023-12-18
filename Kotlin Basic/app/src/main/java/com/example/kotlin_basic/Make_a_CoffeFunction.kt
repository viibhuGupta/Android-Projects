package com.example.kotlin_basic

fun main (){
askMakeCoffe()
}

fun  makeCoffe (sugerCount : Int , name : String) {
    if (sugerCount == 0 ){
        println("Coffe with no Suger for $name")
    }
    else{
        println("A coffe with $sugerCount  Spoon of Suger for $name")
    }
}

fun askMakeCoffe (){
    print("Who Want Coffe To Drink ??  : ")
    val name = readln().toString()
    print("How Many spoon of Suger you Want :  ")
    val  sugerCount = readln().toInt()

    makeCoffe(sugerCount, name)
}