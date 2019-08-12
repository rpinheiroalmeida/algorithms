package birthdaycakecandles

fun birthdayCakeCandles(ar: Array<Int>): Int {
    val max = ar.max()!!

    return ar.count { e -> e == max }
}