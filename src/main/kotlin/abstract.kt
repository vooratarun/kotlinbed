abstract class Shape{
    abstract fun area(): Double
    fun description() = "This is shape"
}

class Circle(private var radius : Double) : Shape() {
    override fun area(): Double  {
        return  Math.PI * radius * radius
    }
}

class Circle2() : Shape() {

    var radius: Double = 1.0;

    constructor(radius: Double) : this() {
        this.radius = radius
    }

    override fun area(): Double {
        return  radius * radius * Math.PI
    }


}
fun main() {
    val circle = Circle(5.0)
    println(circle.area())         // Output: 78.53981633974483
    println(circle.description())  // Output: This is a shape

    val circle2 = Circle2(5.0)
    println(circle2.area());
    println(circle2.description())
}