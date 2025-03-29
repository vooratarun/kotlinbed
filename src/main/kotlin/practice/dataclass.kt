package practice

class User(name: String, var id : Int) {}

data class MyUser(var name: String, var id: Int){}

fun main(args: Array<String>) {
    var user1 = User("Tarun", 10);
    var user2 = User("Tarun", 10);

    if(user1 == user2) {
        println("equal")
    } else {
        println("not equal")
    }

    println(user1);
    println(user2);

    var myUser1 = MyUser("Tarun",10);
    var myUser2 = MyUser("Tarun",10);

    if(myUser1  == myUser2) {
        println("equal")
    } else {
        println("not equal")
    }

    println(myUser1);
    println(myUser2)
}