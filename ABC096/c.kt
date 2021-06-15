fun main() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val s = mutableListOf(".".repeat(w+2))
    for(i in 1..h) s.add("." + readLine()!! + ".")
    s.add(".".repeat(w+2))
    for(y in 1..h) {
        for(x in 1..w) {
            if(s[y][x] == '#' && s[y-1][x] == '.' && s[y+1][x] == '.' && s[y][x+1] == '.' && s[y][x-1] == '.') {
                println("No")
                return
            }
        }
    }
    println("Yes")
}
