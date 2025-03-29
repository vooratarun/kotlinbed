val greetnew : (String) -> Unit = {
     name -> println("name is $name")
}

val greetInt : (Int) -> Unit = {
    int: Int -> println("int is $int")
}

val greetNewS : (String) -> Unit = {
    println("name is $it")
}

val sayHellonew: () -> Unit = {
    println("Say Hello")
};

val addnew: (Int, Int) -> Int = {
    a:Int,b: Int -> a+b
}

val addnew2:(Int,Int,Int) -> Unit = {
    a,b,c ->
        println(a)
        println(a + b + c)

}

val addnew3:(Int,Int) -> Unit = {
    a,b ->
    println(a +b)
}


val square23 :(Int) -> Int = {
    a : Int -> a * a
}

val square34: (Int) -> Unit = {
    a: Int -> println(a)
    println(a * a)
}

fun main() {
    greetnew("ram")
    greetInt(3)
    greetNewS("tarun")
    sayHellonew()
    println( addnew(1,2))
    addnew2(1,2,3)
    addnew3(1,2)
    println(square23(4))
    square34(5)
}