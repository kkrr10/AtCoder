fun main() {
    val w = readLine()!!
    val mp = mutableMapOf<Char, Int>()
    for(c in w) {
        if(c in mp.keys) mp[c] = mp[c]!! + 1
        else mp[c] = 1
    }
    for(v in mp.values) {
        if(v % 2 == 1) {
            println("No")
            return
        }
    }
    println("Yes")
}
