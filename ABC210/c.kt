fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val c = readLine()!!.split(" ").map { it.toInt() }
    val mp = mutableMapOf<Int, Int>()
    for (i in 0 until k) mp[c[i]] = (mp[c[i]] ?: 0) + 1
    var ans = mp.size
    for (i in 0 until n-k) {
        mp[c[i]] = mp[c[i]]!! - 1
        if (mp[c[i]] == 0) mp.remove(c[i])
        mp[c[i+k]] = (mp[c[i+k]] ?: 0) + 1
        ans = maxOf(ans, mp.size)
    }
    println(ans)
}
