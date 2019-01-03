fun main (args: Array<String>){
    print("introduzca el primer numero: ")
    val variable1 = readLine()!!.toInt()
    print("introduzca el segundo numero: ")
    val variable2 = readLine()!!.toInt()
    val resultado1=variable1-variable2
    print("el resultado es: ${resultado1} ")
}