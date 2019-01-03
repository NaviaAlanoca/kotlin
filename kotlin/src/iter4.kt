fun main(args:Array<String>){
    println("introdusca un numero a")
    val a= readLine()!!.toInt()
    if (a>300)
        print("el numero $a es mayor a 300")
    else
        print("el numero $a es menor que 300")
}