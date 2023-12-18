package com.example.kotlin_basic

fun main () {
var  myTrue : Boolean =  true
    var myFalse : Boolean = false

    println(myTrue ||  myFalse) //  return true because any of one statement is true
   println(  myTrue &&  myFalse ) // this return flase because both statement is not true

    // logical not operator
    var myTrue1 : Boolean  = !true
    var myFalse1 : Boolean = false

    println(myTrue1 ||  myFalse1) //  return False because any of one statement is true but we use
    // not operator
    println(  myTrue1 &&  myFalse1 ) // this return True because both statement is not true but we
// use not operator



}