package practice


open class Country {
    protected var a1 = 10;
    protected val b1 = 13
    internal val c1 = 14
    val d1 = 15

    var myA1: Int
    get() = a1
    set(value){
        a1 = value
    }
}

class Bangladesh : Country() {
    fun test() {
        println(myA1)
        println(b1)
        println(c1)
        println(d1)

        myA1 = 25
        println(myA1)
    }
}

fun main(args: Array<String>) {
    Bangladesh().test()

}