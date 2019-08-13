package missingnumbers

import java.util.*

fun missingNumbers(arr: Array<Int>, brr: Array<Int>): Array<Int> {

    val positionArray = Array<Int>(100001, {0})

    brr.forEach {
        positionArray[it]++
    }

    arr.forEach {
        positionArray[it]--
    }

    return positionArray.indices.filter {
        i -> positionArray[i] != 0
    }.sorted().toTypedArray()


//    val countElementsInBrr = brr.associateBy(
//            keySelector = {e -> e},
//            valueTransform = {e -> brr.count { p -> p ==e }}
//    )
//
//    val countElementsInArr = arr.associateBy(
//            keySelector = {e -> e},
//            valueTransform = {e -> arr.count { p -> p ==e }}
//    )
//
//    var minus = mutableListOf<Int>()
//    countElementsInBrr.forEach {
//        val valueInArr = countElementsInArr.getOrDefault(it.key, 0)
//        if (valueInArr == 0 || valueInArr < it.value) minus.add(it.key)
//    }
//
//    return minus.toTypedArray().sortedArray();
}