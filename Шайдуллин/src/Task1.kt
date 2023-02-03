

fun task1(a: Int, d: Int): String {
    var n = 0
    var sum = 0

    n = a + d * (d - 1)

    for (i in d downTo 1)
    {
        sum += a + i * d
    }

    return "N-ый член прогрессии: $n, сумма элементов прогрессии до n: $sum"
}
