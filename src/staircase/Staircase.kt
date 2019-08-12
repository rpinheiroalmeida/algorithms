package staircase

import java.util.*
import kotlin.text.*


fun staircase(n: Int): String {
    var staircase: String = ""
    for (i in 1..n) {
        staircase = staircase.plus("#".repeat(i).padStart(n)).plus("\n")
    }
    return staircase;
}

fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)

        val n = scan.nextLine().trim().toInt()

    staircase(n)
}