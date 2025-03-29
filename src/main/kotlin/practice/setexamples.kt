package practice

fun main(args: Array<String>) {

    val numbers = setOf(1, 2, 3, 4, 5)
    println(numbers)  // Output: [1, 2, 3, 4, 5]

    val fruits = setOf("Apple", "Banana", "Cherry")

    println("Apple" in fruits)  // true
    println("Grapes" in fruits) // false

    val colors = setOf("Red", "Green", "Blue")

    for (color in colors) {
        println(color)
    }

   //  mutableSetOf
    val names = mutableSetOf("Alice", "Bob")
    names.add("Charlie")
    names.remove("Bob")

    println(names)

    // set operations
    val setA = setOf(1, 2, 3)
    val setB = setOf(3, 4, 5)

    val unionSet = setA.union(setB)

    println(unionSet)  // Output: [1, 2, 3, 4, 5]

    val setA2 = setOf(1, 2, 3, 4)
    val setB2 = setOf(3, 4, 5, 6)

    val intersectionSet = setA2.intersect(setB2)

    println(intersectionSet)  // Output: [3, 4]


    val setA3 = setOf(1, 2, 3, 4, 5)
    val setB3 = setOf(3, 4)

    val differenceSet = setA3.subtract(setB3)

    println(differenceSet)  // Output: [1, 2, 5]


    val setA4 = setOf(1, 2, 3)
    val newSet = setA4 + 4  // Adds 4
    println(newSet)  // Output: [1, 2, 3, 4]

    val removedSet = newSet - 2  // Removes 2
    println(removedSet)  // Output: [1, 3, 4]


    val numbers2 = setOf(10, 20, 30)
    println(numbers2.contains(20))  // Output: true
    println(30 in numbers2)         // Output: true


}