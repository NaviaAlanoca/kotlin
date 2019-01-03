fun main (args: Array<String>){
    print("valor de a: ")
    val a = readLine()!!.toInt()
    print("valor de b: ")
    val b = readLine()!!.toInt()
    print("valor de c: ")
    val c = readLine()!!.toInt()

    if(a>b)
        if (a>c)
    print(a)
    else
            print(c)
    else
        if (b>c)
            print(b)
    else
            print(c)

}