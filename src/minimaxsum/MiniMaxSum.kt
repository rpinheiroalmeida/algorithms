package minimaxsum

import java.util.*
import kotlin.collections.*
import kotlin.text.*

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Array<Long> {
    var min:Int = arr.min()!!
    var max:Int = arr.max()!!

    var sum:Long = 0
    arr.forEach { n -> sum = sum + n }

    sum.let {
        println("${it - max} ${it - min}")
    }
    return arrayOf(sum - max, sum - min)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()


    println(miniMaxSum(arr).get(0))
}
