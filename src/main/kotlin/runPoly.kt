open class Vehicle {
    open fun start(){
        println("vehicle is starting")
    }
}

class Bike : Vehicle() {
    override fun start() {
        println("Bike is starting");
    }
}

fun main() {
    val bike: Vehicle = Bike();
    bike.start()

    val bike2: Bike = Bike();
    bike2.start();

    val bike3 = Bike();
    bike3.start();
}