package practice

fun main(args: Array<String>) {
    println(MyData.getCounts())

    MyData.count = 10
    println(MyData.getCounts())

    MyData.getName("Zakaria")
}

open class MySuperData {
    open fun getName(name: String) {
        println("Name from super: $name")
    }
}

object MyData: MySuperData() {
    var count = 1 //behaves like static variable

    fun getCounts(): Int = count //behaves like static function

    override fun getName(name: String) {
        super.getName(name)
        println("Name from sub: $name")
    }
}

/*
* object keyword are behaving like as static fields
* */