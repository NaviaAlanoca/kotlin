//dado un numero x determinar si es un numero
//primo desplegar el numero y mostra el un mensaje
fun main(args:Array<String>){
    println("ingrese un numero")
    val x = readLine()!!.toInt()
    var a = 0
    for (d in 1..x){
        if ((x/d)*d==x){
            a=a+1
        }
    }
    if (a==2)
        println("$x es un numero primo ")
    else
        println("$x no es un numero primo ")
}