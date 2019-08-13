package sherlockandarray

fun balancedSums(arr: Array<Int>): String {
    val sum = arr.sum()
    var leftSum = 0
    var rightSum = sum - arr[0]

    for (i in 0 .. arr.size - 2) {
        if (leftSum == rightSum) {
            return "YES"
        }

        leftSum += arr[i]
        rightSum -= arr[i+1]
    }

    if (leftSum == rightSum) return "YES" else return "NO"
}