fun main() {
    val n = readLine()!!.toInt()
    var ans = 0
    var valid = 200
    for(i in 1..n) {
        val s = readLine()!!.toInt()
        ans += s
        if(s % 10 != 0 && s < valid) valid = s
    }
    if(ans % 10 != 0) println(ans)
    else if(valid != 200) println(ans - valid)
    else println(0)
}
