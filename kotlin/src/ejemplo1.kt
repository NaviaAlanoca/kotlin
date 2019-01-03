fun main (args: Array<String>){
    println("ingrese el valor de a: ")
    val a= readLine()!!.toInt()
    println("ingrese el valor de b: ")
    val b = readLine() !!.toInt()

    println("Suma: ${a+b}, Resta: ${a-b}, Multiplicacion: ${a*b} , division: ${a/b}")
}