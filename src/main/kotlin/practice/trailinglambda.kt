package practice


fun greet(name: String, action: (String)-> String) {
    val message = action(name);
    println(message);
}

fun main(args: Array<String>){

    val numbers = listOf(1,2,3,4);
    // Normal lambda inside parentheses
    numbers.forEach({
        println(it)
    })

    println("---------------------")
    // Using trailing lambda
    numbers.forEach{
        println(it)
    }
    println("---------------------")
    // Without trailing lambda
    greet("Alice",{
        "Hello $it"
    })

    println("---------------------")
    // With trailing lambda
    greet("Bob"){
        "Hi $it"
    }

}
