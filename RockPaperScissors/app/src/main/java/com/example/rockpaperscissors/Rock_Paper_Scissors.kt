package com.example.rockpaperscissors

fun main() {

    var computerChoice = ""
    var playerChoice = ""


    var isValiedChoice = false

    while (!isValiedChoice) {
        println("Rock, Paper, or Scissors? Enter Your Choice!! : ")
        playerChoice = readln().lowercase()

        isValiedChoice = when (playerChoice) {
            "rock", "paper", "scissors" -> true

            else -> {
                println("please enter vailed Choice")
                false
            }
        }
    }


    val randomNumber = (1..3).random()

    if (randomNumber == 1) {
        computerChoice = "Rock"
    } else if (randomNumber == 2) {
        computerChoice = "Paper"
    } else if (randomNumber == 3) {
        computerChoice = "Scissors"
    }

    println(computerChoice)

    val winner = when {

        // Please be Notiched In String There no space


        //  playerChoice == computerChoice  , -> "Tie"
        playerChoice.equals(computerChoice, ignoreCase = true) -> "Tie"

        //  playerChoice  == "Rock" && computerChoice == "Paper" -> "Player"
        playerChoice.equals("Rock", ignoreCase = true) && computerChoice.equals(
            "Paper",
            ignoreCase = true
        ) -> "Player"

        //  playerChoice == "Scissors" && computerChoice == "Rock" -> "Player"
        playerChoice.equals("Scissors", ignoreCase = true) && computerChoice.equals(
            "Rock",
            ignoreCase = true
        ) -> "Player"

        // playerChoice == "Paper"  &&  computerChoice == "Scissors"  -> "Player"
        playerChoice.equals("Paper", ignoreCase = true) && computerChoice.equals(
            "Scissors",
            ignoreCase = true
        ) -> "Player"

        else -> "Computer"

    }

    if (winner.equals("Tie", ignoreCase = true)) {
        println("Game Tie")
    } else if (winner.equals("Player", ignoreCase = true)) {
        println("Player Won")
    } else {
        println("Computer Won!!")
    }
//


}

