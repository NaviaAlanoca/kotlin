// realizar la tabla de multiplicar 1 al 9
fun main(args:Array<String>){
    for (x in 1..9){
        for (y in 1..9){
            val z = x*y
            println("$x X $y = $z")
        }
    }
}