package practice

class PersonNew2(val firstName: String, val lastName: String) {
    val fullName: String get() = "fullName is $firstName $lastName"
}

class TemperatureNew(celsius: Double) {
    private var _celsius = celsius

    val fahrenheit: Double
        get() = _celsius * 9/5 + 32
}

class UserNew(val age: Int) {
    val isAdult : Boolean
        get() = age >= 18

}

fun main(args: Array<String>){

    val person = PersonNew2("ram","charan");
    println(person.fullName);

    val temp = TemperatureNew(25.0);
    println(temp.fahrenheit);

    val user = UserNew(20);
    println(user.isAdult)

}