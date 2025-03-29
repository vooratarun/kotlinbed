package practice

fun main(args: Array<String>) {
    var subContinent = SubContinent();
    subContinent.people();
    subContinent.country()
    println(subContinent.name)
}


abstract class Continent{
  abstract  var name : String

  abstract fun people()

   open fun country () {
        println("print country from abstract class")
  }
}


class  SubContinent : Continent() {
    override var name: String = "Zakaria"

    override fun people() {
//        TODO("Not yet implemented")
        println("print people from normal class")
    }

    override fun country() {
        super.country()
        println("Print country from normal class")
    }
}