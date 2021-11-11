fun main() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val grid = Array(h) { readLine()!!.split(" ").map { it.toInt() } }
    var ans = 0
    for (bit in 0 until (1 shl h)) {
        val candidate = mutableMapOf<Int, Int>()
        for (x in 0 until w) {
            val nums = mutableSetOf<Int>()
            for (y in 0 until h) if ((bit shr y) and 1 == 1) nums.add(grid[y][x])
            if (nums.size == 1) nums.toList()[0].let { candidate[it] = (candidate[it] ?: 0) + 1 }
        }
        ans = maxOf(ans, Integer.bitCount(bit) * (candidate.values.max() ?: 0))
    }
    println(ans)
}
