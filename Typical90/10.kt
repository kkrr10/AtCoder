fun main() {
    val n = readLine()!!.toInt()
    val class1 = IntArray(n)
    val class2 = IntArray(n)
    for (number in 0 until n) {
        val (c, p) = readLine()!!.split(" ").map { it.toInt() }
        if (c == 1) class1[number] = p
        else class2[number] = p
    }
    val class1Sum = IntArray(n+1)
    val class2Sum = IntArray(n+1)
    for (i in 1..n) {
        class1Sum[i] = class1Sum[i-1] + class1[i-1]
        class2Sum[i] = class2Sum[i-1] + class2[i-1]
    }
    val q = readLine()!!.toInt()
    repeat(q) {
        val (l, r) = readLine()!!.split(" ").map { it.toInt() }
        println("${class1Sum[r] - class1Sum[l-1]} ${class2Sum[r] - class2Sum[l-1]}")
    }
}
