fun main() {
    val s = readLine()!!
    for(i in (s.length-1) downTo 0) {
        if(s[i] == 'Z') {
            println(i - s.indexOf('A') + 1)
            return
        }
    }
}
