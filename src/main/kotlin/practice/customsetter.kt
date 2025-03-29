package practice

class PersonAge {
    var age : Int = 0
        set(value) {
            field = if(value >= 0) value else 0
        }
}

class UserName {
    var name: String = "Unknown"
        set(value) {
            println("Name changed from $field to $value")
            field = value
        }

}

class  ProductNew {
    var price : Double = 0.0
        set(value){
            field  = "%.2f".format(value).toDouble();
        }

}

class BankAccountNew {
    private var _balance : Double = 0.0

    var balance: Double
        get() = _balance
        private set(value) {
            _balance = value
        }

    fun deposit(amount : Double) {
        if(amount > 0)
            balance += amount
    }
}

fun main(args :Array<String>) {
    val p1 = PersonAge();
    p1.age = 25
    println(p1.age)

    p1.age = -5;
    println(p1.age)

    println("--------------------------")

    val user = UserName();
    user.name = "one"
    user.name = "two"

    println("--------------------------")

    val product = ProductNew();
    product.price = 12.3456
    println(product.price);

    println("--------------------------")

    val account = BankAccountNew();
    account.deposit(100.0)
    println(account.balance) // Output: 100.0

}