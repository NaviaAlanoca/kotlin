//dado 2 numeros a y b realizar el producto de
//dos numeros por sumas sucesivas, almacenar el
//resultado en una variable p mostrar el resultado

fun main(args:Array<String>){
    println("ingrese el primer valor")
    val a = readLine()!!.toInt()
    println("ingrese el segundo valor")
    val b = readLine()!!.toInt()
    var p = 1
    for (c in 1..b){
         p = p+a
    }
    print("$p")
}