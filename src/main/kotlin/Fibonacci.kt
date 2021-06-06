fun fibonacciRecursive(n: Int): Long {
    if (n < 2) {
        return n.toLong()
    }
    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2)
}


fun fibonacciDp(n: Int): Long {

    // unnecessary step,
    if (n < 2) {
        return n.toLong()
    }

    val table = LongArray(n + 1).apply {
        this[0] = 0
        this[1] = 1
    }


    for (i in 2..n) {
        table[i] = table[i - 1] + table[i - 2]
    }

    return table[n]
}