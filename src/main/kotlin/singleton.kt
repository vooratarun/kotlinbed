object Logger {
    fun log(message: String) {
        print("Log: $message");
    }
}

fun main() {
    Logger.log("this is singleton example");
}