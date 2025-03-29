package practice

fun main() {
    val num = 10

    when {
        num < 0 -> println("Negative number")
        num == 0 -> println("Zero")
        num > 0 -> println("Positive number")
    }

    val fruit = "Mango"

    when (fruit) {
        "Apple" -> println("It's an Apple!")
        "Mango" -> println("It's a Mango!")
        "Banana" -> println("It's a Banana!")
        else -> println("Unknown fruit")
    }

    val grade = 'B'

    val result = when (grade) {
        'A' -> "Excellent"
        'B' -> "Good"
        'C' -> "Average"
        'D' -> "Below Average"
        else -> "Fail"
    }

    println(result)

    val marks = 85

    when (marks) {
        in 90..100 -> println("A+ Grade")
        in 80..89 -> println("A Grade")
        in 70..79 -> println("B Grade")
        in 60..69 -> println("C Grade")
        else -> println("Fail")
    }


    val today = Days.SAT

    when (today) {
        Days.SAT, Days.SUN -> println("Weekend!")
        else -> println("Weekday")
    }
}

enum class Days { MON, TUE, WED, THU, FRI, SAT, SUN }

