class Calculator {
    fun add(a: Int, b: Int): Int = a + b
    fun add(a: Double, b : Double): Double {
        return  a + b;
    }

}

fun main(){
    val calc = Calculator();
    println( calc.add(1,2))
    println(calc.add(1.2,1.2))
}