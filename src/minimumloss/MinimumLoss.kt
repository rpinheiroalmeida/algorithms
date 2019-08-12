package minimumloss

fun minimumLoss(price: Array<Long>): Int {

    val pricesAndDays = price.mapIndexed { index, value ->  Pair(value, index)}.toList().sortedByDescending {
        pair -> pair.first
    }

    var minimumLoss:Long = Long.MAX_VALUE
    val n = price.size

    for (i in 0..n-2) {
        val difference = pricesAndDays[i].first - pricesAndDays[i+1].first
        if (difference < minimumLoss && pricesAndDays[i].second < pricesAndDays[i+1].second) {
            minimumLoss = difference
        }
    }

    return minimumLoss.toInt()
}

//20, 15, 8, 2, 12
//20, 15, 12, 8, 2
//20, 7, 8, 2, 5