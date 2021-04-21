fun main() {
    val s = readLine()!!
    var ans: Long = 0
    var suc: Char = ' '
    for(i in 1..(s.length-1)) {
        if(suc != ' ') {
            if(s[i] != suc) {
                ans++
                if(s[i] == s[i-1]) {
                    suc = s[i]
                    ans += s.length - i - 1
                }
            }
        }
        else {
            if(s[i] == s[i-1]) suc = s[i]
        }
    }
    println(ans)
}
