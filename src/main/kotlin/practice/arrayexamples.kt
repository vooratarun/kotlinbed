package practice

fun main(args : Array<String>) {

    val arr = arrayOf("Apple", "Banana", "Cherry")
    println(arr.contentToString())  // Output: [Apple, Banana, Cherry]

    val fruits = listOf("Apple", "Banana", "Cherry")
    println(fruits)  // Output: [Apple, Banana, Cherry]


    val mutableFruits = mutableListOf("Apple", "Banana")
    mutableFruits.add("Cherry")
    println(mutableFruits)  // Output: [Apple, Banana, Cherry]


    println(arr[1])  // Output: Banana
    println(fruits[1])  // Output: Banana

    arr[1] = "Blueberry"
    println(arr.contentToString())  // Output: [Apple, Blueberry, Cherry]


    mutableFruits[1] = "Blueberry"
    println(mutableFruits)  // Output: [Apple, Blueberry, Cherry]

    val newArr = arr + "Mango"
    println(newArr.contentToString())  // Output: [Apple, Blueberry, Cherry, Mango]


    mutableFruits.add("Mango")
    mutableFruits.remove("Banana")
    println(mutableFruits)  // Output: [Apple, Blueberry, Cherry, Mango]

    arr.forEach {
        println(it)
    }

    println("-----------------")
    mutableFruits.forEach {
        println(it)
    }

    println("-----------------")
    for (fruit in mutableFruits) {
        println(fruit)
    }

    println("-----------------")
    val numArray = arrayOf(5, 2, 8, 1)
    numArray.sort()
    println(numArray.contentToString())  // Output: [1, 2, 5, 8]

    println("-----------------")
    val numList = mutableListOf(5, 2, 8, 1)
    numList.sort()
    println(numList)  // Output: [1, 2, 5, 8]
}