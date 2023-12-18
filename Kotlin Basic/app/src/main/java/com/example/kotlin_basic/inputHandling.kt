package com.example.kotlin_basic

fun main (){
  print("Please Enter the Number : ")
   val userInput = readln()


  while (userInput == "7"){
    println("While Loop Executed  $userInput")

    break
  }


  val num2 = 2
  println(userInput.toInt()* num2)



}