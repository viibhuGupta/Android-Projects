package com.example.kotlin_basic

fun main (){
    print("Enter the First Number : ")
    var num1 = readln().toInt()
    print("Enter the Second Number : ")
    var num2 = readln().toInt()

    val result = addTwoNumber(num1,num2)
    println("$num1 + $num2 = $result")
}
fun addTwoNumber (num1 : Int , num2 : Int) :Int {
    return num1 + num2
}