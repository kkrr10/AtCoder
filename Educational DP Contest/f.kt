import kotlin.math.max

fun main() {
    val s = readLine()!!
    val t = readLine()!!

    val dp = Array(s.length+1) { Array(t.length+1) { 0 } }
    for(i in 0 until s.length) {
        for(j in 0 until t.length) {
            dp[i+1][j+1] = if(s[i] == t[j]) dp[i][j] + 1 else max(dp[i][j+1], dp[i+1][j])
        }
    }

    var ans = ""
    var i = s.length
    var j = t.length
    while(ans.length < dp[s.length][t.length]) {
        if(s[i-1] == t[j-1]) {
            ans = "${s[i-1]}$ans"
            i--
            j--
        }
        else if(dp[i][j] == dp[i-1][j]) i--
        else j--
    }
    println(ans)
}
