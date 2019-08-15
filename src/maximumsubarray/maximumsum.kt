package maximumsubarray

import java.util.*
import kotlin.math.max

fun maximumSum(a: Array<Long>, m: Long): Long {
    val n = a.size
    val prefix = Array(n, {0L})

    var curr = 0L
    a.indices.forEach {
        curr = (a[it] % m + curr) % m
        prefix[it] = curr
    }
    var ret:Long = prefix.max()!!

    var tree: TreeSet<Long> = TreeSet()
    tree.addAll(prefix)

    a.indices.forEach {
        val left = tree.higher(prefix[it])
        if (left != null) {
            ret = max(ret, (prefix[it] - left + m) % m)
        }
        tree.add(prefix[it])
    }

    return ret
}

//    for (i in 0..n-1) {
//        for (j in i-1 downTo  0) {
//            ret = max(ret, (prefix[i] - prefix[j] + m) % m)
//        }
//        ret = max(ret, prefix[i])
//    }
