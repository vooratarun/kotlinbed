data class User(val id: Int, val name : String)
fun main() {

    val user1 = User(1,"tarun")
    val user2 = User(1,"tarun")

    println(user1 == user2);
    println(user1.toString());
    println(user2.toString());
}
