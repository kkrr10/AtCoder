fun main() = println(readLine()!!.let { s -> (s[s.length-1] - '0').let { "${s.substring(0, s.length-2)}${if (it < 3) "-" else if (6 < it) "+" else ""}" } })