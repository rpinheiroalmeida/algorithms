package missingnumbers

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
}