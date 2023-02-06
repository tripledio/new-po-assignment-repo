package io.tripled.scorekeeper

import kotlin.jvm.JvmStatic
import java.util.*

object ScoreKeeperApplication {

    @JvmStatic
    fun main(args: Array<String>) {
        println("**************************")
        println("**    Score Keeper        **")
        println("**************************")
        readInput()
    }

    private fun readInput() {
        println("> q to quit")
        Scanner(System.`in`).use { scanner ->
            var input: String
            do {
                input = scanner.nextLine()
                println("I read :$input")
            } while (!isQuit(input))
        }
        println("*********END*****************")
    }

    private fun isQuit(input: String): Boolean {
        return "q".equals(input, ignoreCase = true)
    }
}