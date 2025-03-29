interface Movable {
    fun move();
}

interface Stoppable{
    fun stop()
}

class Car : Movable,Stoppable {
    override fun move() {
        println("car is moving");
    }

    override fun stop() {
        println("car is stopping");
    }
}

fun main() {
    val  car = Car();
    car.move()
    car.stop();
}