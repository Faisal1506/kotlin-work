// Task 4.2: use of if and ranges

fun main() {
    println("Pizza Menu")
    println("A.Magarita")
    println("B.Quattro Stagioni")
    println("C.Seafood")
    println("D.Hawaiian")
    print("Choose Your Order (A-D): ")

    val pizza = readln().lowercase()

    if (pizza.length == 1 && pizza[0] in 'a'..'d'){
        println("Order accepted")
    }
    else{
        println("Invalid Choice")
    }
}
