
fun main(args:Array<String>){
    val n= readLine()!!.toInt()
    for (x in 1..n)
        if (x%2==0)
            println("$x es par ")
        else
            println(" $x es impar")


}