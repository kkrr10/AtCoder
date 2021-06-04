fun main() {
    val n = readLine()!!.toInt()
    val a: Array<Int?> = arrayOfNulls(n+1)
    val visited: Array<Int?> = arrayOfNulls(n+1)
    for(i in 1..n) a[i] = readLine()!!.toInt()

    var pos = 1
    var cnt = 0
    while(true) {
        if(pos == 2) {
            println(cnt)
            return
        }
        visited[pos] = 1
        pos = a[pos]!!
        cnt++
        if(visited[pos] != null) {
            println(-1)
            return
        }
    }
}
