// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val text = "Hello World 123"

    println("Uppercase: ${text.howMany {it.isUpperCase()}} ")
    println("Digit: ${text.howMany {it.isDigit()}}")
    println("Lowercase: ${text.howMany {it.isLowerCase()}}")
    println("Space: ${text.howMany {it == ' '}}")
}
