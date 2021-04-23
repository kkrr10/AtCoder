fun main() {
    val (n, c, k) = readLine()!!.split(" ").map { it.toInt() }
    var time = mutableListOf<Int>()
    for(i in 0..(n-1)) {
        val t = readLine()!!.toInt()
        time.add(t)
    }
    time.sort()

    var ans = 0
    var pas = c
    var limitTime = -1
    for(i in 0..(n-1)) {
        if(pas == c || limitTime < time[i]) {
            ans++
            pas = 1
            limitTime = time[i] + k
        }
        else pas++
    }

    println(ans)
}
