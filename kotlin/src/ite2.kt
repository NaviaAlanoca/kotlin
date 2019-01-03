//el factorial dcalcular e un numero N
// mostrar el numero y su factorial






fun main(args:Array<String>){
    println("ingrese un numero")
    val n = readLine()!!.toInt()
    var fact = 1
    for (c in 1..n){
        fact=fact*c
    }
    println("el resultado  factorial de $n es $fact")
}