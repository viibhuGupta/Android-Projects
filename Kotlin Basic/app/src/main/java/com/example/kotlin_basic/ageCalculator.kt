package com.example.kotlin_basic

fun main (){
    print("Please Enter you Age in Whole Numbe :  ")
    val age =  readln().toInt()
    if (age in 18..40){
        println("You can go into the Club")
    }
    else if ( age >= 40 ){
        println("You  Can not go into a club , go Home and rest  ")
    }
    else{
        println("You are To young to Go into Club")
    }



}