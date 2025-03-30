package practice

class MyClass {
    companion object {
        val myStaticValue = "Hello, Companion Object!"

        fun printMessage() {
            println("This is a function inside the companion object.")
        }
    }
}
class Config {
    companion object {
        const val APP_NAME = "MyKotlinApp"
        const val VERSION = "1.0.0"
    }
}

interface Logger {
    fun log(message: String)
}

class MyClass2 {
    companion object : Logger {
        override fun log(message: String) {
            println("Log: $message")
        }
    }
}



fun main() {
    println(MyClass.myStaticValue) // Accessing property
    MyClass.printMessage() // Calling function

    println(Config.APP_NAME)  // Output: MyKotlinApp

    MyClass2.log("Companion object implementing an interface!")


}
