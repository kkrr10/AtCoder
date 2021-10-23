fun main(){
    val (h,w)=readLine()!!.split(" ").map{it.toInt()}
    println(if(h==1||w==1)h*w else(h+1)/2*((w+1)/2))
}