fun main() {
    val n = readLine()!!.toInt()
    val points = mutableListOf<Pair<Double, Double>>()
    for(i in 0..n-1) {
        val (x, y) = readLine()!!.split(" ").map { it.toDouble() }
        points.add(Pair(x, y))
    }

    var ans = 0
    for(i in 0..n-2) {
        for(j in i+1..n-1) {
            val slope = (points[i].second - points[j].second) / (points[i].first - points[j].first)
            if(-1 <= slope && slope <= 1) ans++
        }
    }

    println(ans)
}
