fun main() {
    val s = readLine()!!
    var ans = 0
    for(i in 0..9) {
        if(s[i] == 'x') continue
        for(j in 0..9) {
            if(s[j] == 'x') continue
            for(k in 0..9) {
                if(s[k] == 'x') continue
                for(l in 0..9) {
                    if(s[l] == 'x') continue
                    var ok = true
                    for((number, state) in s.withIndex()) {
                        if(state == 'o' && !listOf(i, j, k, l).contains(number)) {
                            ok = false
                            break
                        }
                    }
                    if(ok) ans++
                }
            }
        }
    }
    println(ans)
}
