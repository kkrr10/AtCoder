fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val points = mutableListOf<Long>()
    repeat(n) {
        val (a, b) = readLine()!!.split(" ").map { it.toLong() }
        points.add(a-b)
        points.add(b)
    }
    points.sortBy { -it }
    println(points.mapIndexed { i, v -> if (i < k) v else 0}.sum())
}
