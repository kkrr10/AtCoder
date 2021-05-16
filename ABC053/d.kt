fun main() {
    readLine()
    val a = readLine()!!.split(" ").map(String::toInt)
    val st = mutableSetOf<Int>()
    for(i in a) st.add(i)
    val distinct = st.size
    println(if(distinct % 2 == 1) distinct else distinct - 1)
}

// fun main() {
//     val n = readLine()!!.toInt()
//     val a = readLine()!!.split(" ").map(String::toInt)
//     val mp = mutableMapOf<Int, Int>()
//     for(i in a) {
//         // Note
//         if(i in mp.keys) mp[i] = mp[i]!! + 1
//         else mp[i] = 1
//     }
//     var count = 0
//     var twoCount = 0
//     for((k, v) in mp) {
//         if(v >= 3) {
//             count += v / 2 - 1 + v % 2
//             mp[k] = 2 - v % 2
//             twoCount += 1 - v % 2
//         }
//         else if(v == 2) twoCount++;
//     }
//     println(n - (count + (twoCount + 1) / 2) * 2)
// }
