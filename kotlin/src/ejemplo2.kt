fun main (args: Array<String>){
    print ("Ingresar numero a: ")
    val a = readLine()!!.toInt()
    print ("Ingresar numero b: ")
    val b = readLine()!!.toInt()
    print("Ingrese operacion aritmetica: ")
    val operador = readLine()!!.toString()

    when (operador){
        "+" -> println ("La suma es: ${a+b}")
        "-" -> println ("La resta es: ${a-b}")
        "*" -> println ("La multiplicacion es: ${a*b}")
        "/" -> println ("La divicion es: ${a/b}")
        else -> println("Opcion no valida")
    }

}