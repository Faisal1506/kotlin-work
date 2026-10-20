// Task 5.1.1: anagrams() function
fun anagrams(first: String, seconde: String): Boolean{

    if (first.length != seconde.length){
        return false
    }

    val firstChars = first.lowercase().toList().sorted()
    val secondeChars = seconde.lowercase().toList().sorted()

    return firstChars == secondeChars
}