package com.example.kotlin_basic

class Book  (val  title : String  = "Unknown", val  author  : String = "Anonymous" ,val
yearPublished  :
Int  = 2023){

    init {
myBook()
    }
fun myBook (){
    println(" $title Written by $author and publish in year $yearPublished")
}
}