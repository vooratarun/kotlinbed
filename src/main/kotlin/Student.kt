class Student {
    var name: String = ""
    var rollNumber: Int = 0

    constructor(name: String, rollNumber: Int) {
        this.name = name
        this.rollNumber = rollNumber
    }
}

class StudentNew(val name: String, var rollNumber: Int)

fun main() {
    val s = Student("name",12);
    println(s.name)
    println(s.rollNumber)

    val s2 = StudentNew("name2",10);

    println(s2.name);
    println(s2.rollNumber)
}
