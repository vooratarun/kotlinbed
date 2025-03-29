package practice

fun main(args: Array<String>) {
    named(y = "Zakaria", x = "Md", z = "Hossain")
    named(y = "Zakaria", x = "Md")
    named(x = 1, y = 2, z = 3)
}

fun named(x: Any, y: Any, z: Any = "Nothing") {
    println("Name1 = $x, Name2 = $y, Name3 = $z")
}