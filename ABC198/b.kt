fun main() {
    var n = readLine()!!
    for(i in 0 until n.length) {
        var l = 0
        var r = n.length - 1
        var isPalindrome = true
        while(l <= r) {
            if(n[l] != n[r]) {
                isPalindrome = false
                break
            }
            l++
            r--
        }
        if(isPalindrome) {
            println("Yes")
            return
        }
        n = "0$n"
    }
    println("No")
}
