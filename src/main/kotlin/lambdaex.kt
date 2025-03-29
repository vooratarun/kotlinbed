val greet: (String) -> Unit = {
    name: String -> println("Hello $name")
}

val sayHello:() -> Unit = {
    println("Hello world")
}

val add : (Int, Int) -> Int = {
    a,b -> a + b
}

val add2 :(Int,Int, Int) -> Unit = {
    a,b,c -> println(a + b + c)
}

val square :(Int) -> Int = {
    it * it
}

val square2 : (Int)-> Unit = {
    println(it * it)
}

fun getMultiplier(factor : Int) : (Int) -> Int {

    return  {number -> number * factor}
}

fun main() {
    greet("Alice");
    sayHello();
    println(add(1,2));
    add2(10,20,30)
    println(square(3));
    square2(10);

    val double = getMultiplier(2);
    println(double(4));

    listOf(1,2,3,4).forEach{
        println(it * 2)
    }

    val numbers = listOf(1,2,3,4);
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers);

    val doubled = numbers.map { it * 2 }
    println(doubled)

    val name = "Kotlin"
    name.let {
        println("The length of $it is ${it.length}")
    }
}