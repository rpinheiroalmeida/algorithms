package pairs

fun pairs(k: Int, arr: Array<Int>): Int {
    val orderedArr = arr.sortedArray()

    var quantityDifferences = 0
    orderedArr.indices.forEach {
        val nextNumber = k + orderedArr[it]

        val index = orderedArr.binarySearch(nextNumber)
        if (index >= 0) quantityDifferences++
    }

    return quantityDifferences
}