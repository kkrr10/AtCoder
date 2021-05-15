fun main() {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    var x = 0
    var mx = 0
    for(i in 0..(n-1)) {
        if(s[i] == 'I') x++
        else x--
        if(x > mx) mx = x
    }
    println(mx)
}
