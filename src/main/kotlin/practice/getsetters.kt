package practice

class BankAccount {
    private var balance: Int = 1000  // Private variable

    var publicBalance: Int
        get() = balance  // Getter exposes the value
        set(value) {  // Setter allows controlled update
            if (value >= 0) balance = value
        }
}

class Student {
    var percentage: Int = 0
        set(value) {
            field = if (value in 0..100) value else 0  // Restrict value between 0-100
        }
}

class Temperature {
    var celsius: Double = 25.0

    val fahrenheit: Double
        get() = (celsius * 9/5) + 32  // Converts Celsius to Fahrenheit
}



fun main() {
    val account = BankAccount()
    println(account.publicBalance)  // Output: 1000

    account.publicBalance = 2000
    println(account.publicBalance)  // Output: 2000

    account.publicBalance = -500  // ❌ Won't change (invalid)
    println(account.publicBalance) // Output: 2000

    val student = Student()
    student.percentage = 85
    println(student.percentage)  // Output: 85

    student.percentage = 120
    println(student.percentage)

    val temp = Temperature()
    println(temp.fahrenheit)
}
