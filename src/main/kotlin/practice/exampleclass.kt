package practice

class Person(var name: String, var age: Int) {
    fun introduce() {
        println("Hi, my name is $name and I am $age years old.")
    }
}

class Car(var brand: String, var model: String) {
    init {
        println("$brand $model is created!")
    }
}

class Employee(var name: String, var age: Int) {
    var salary: Double = 0.0

    constructor(name: String, age: Int, salary: Double) : this(name, age) {
        this.salary = salary
    }

    fun details() {
        println("Employee: $name, Age: $age, Salary: $$salary")
    }
}

data class StudentNew(var name: String, var grade: Int)


class PersonNew {
    var name = ""

    fun display(name: String) {
        this.name = name
        println("Person's name: $name")  // ✅ Now it actually displays something
    }
}

fun main() {
    val person = Person("Alice", 25)
    person.introduce()  // ✅ Output: Hi, my name is Alice and I am 25 years old.

    val car = Car("Toyota", "Corolla")  // ✅ Output: Toyota Corolla is created!


    val emp1 = Employee("John", 30)
    val emp2 = Employee("Alice", 28, 5000.0)

    emp1.details()  // ✅ Output: Employee: John, Age: 30, Salary: $0.0
    emp2.details()  // ✅ Output: Employee: Alice, Age: 28, Salary: $5000.0

    val student1 = StudentNew("Jake", 10)
    val student2 = StudentNew("Jake", 10)

    println(student1 == student2)  // ✅ Output: true (compares values, not references)
    println(student1)  // ✅ Output: Student(name=Jake, grade=10)
    println(student2)

    val personnew = PersonNew()
    personnew.display("Alice")  // ✅ Output: Person's name: Alice
}
