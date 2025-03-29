package practice


val sum: (Int,Int) -> Int = {
    a,b -> a +b
}

val  square: (Int) -> Int = {
    it * it
}

//3. Lambda as a Function Parameter
fun operateOnNumbers(a:Int, b: Int, operation : (Int ,Int)-> Int): Int {
    return  operation(a,b)
};

// 4. Returning a Lambda from a Function
fun  getMultiplier(factor: Int): (Int) -> Int {
    return  {number -> number * factor}
}


fun main(args : Array<String>) {
    println(sum(1,2))
    println(square(2))
    val result = operateOnNumbers(2,3,({
        x,y -> x * y
    }))
    println(result);

    val addition = operateOnNumbers(3,4){
        a,b -> a + b
    }
    println(addition)

    val  double = getMultiplier(2);
    println(double(5))

    val numbers = listOf(1,2,3,4,5);
    val evenNumbers = numbers.filter { it % 2 ==0 };
    println(evenNumbers)

    val names = listOf("alice","bob","charlie");
    val namesLength = names.map { it.length }
    println(namesLength);

}
