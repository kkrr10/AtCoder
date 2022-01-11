fun main() {
	val n = readLine()!!.toLong()
	var ans = 0L
	for (a in 1..n) {
		if (a*a*a > n) break
		for (b in a..n) {
			if (a*b*b > n) break
			ans += n / (a*b) - b + 1
		}
	}
	println(ans)
}
