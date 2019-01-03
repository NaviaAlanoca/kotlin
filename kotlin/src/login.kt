fun main (args: Array<String>){
    print("nombre: ")
    val nombre = readLine()!!.toString()
    print("contraseña: ")
    val clave = readLine()!!.toInt()
    print("año de nacimiento: ")
    val fecha = readLine()!!.toInt()
val edad=2018-fecha
    if(nombre=="nel" && clave==123 &&
     edad>=18)
        print("BIENVENIDO AL SISTEMA ${nombre}")
    else print("DATOS INCORRECTOS")
}