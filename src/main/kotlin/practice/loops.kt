package practice


fun main(args: Array<String>) {
    for(i  in 1 .. 10) {
        println(i)
    }

    println("----------------")

    for(i in 6 downTo 0 step 2){
        println(i);
    }

    println("----------------")

    for(i in 0 until 10 step  2){
        println(i)
    }

    println("----------------")

    for( i in 5 downTo(1) step  2) {
     println(i)
    }
    println("----------------")

    var range1 = 1..5
    println(range1)


}