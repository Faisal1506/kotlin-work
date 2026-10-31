infix fun String.anagramOf(seconde: String): Boolean{
    if (this.length != seconde.length){
        return false
    }

    val firstchars = this.lowercase().toList().sorted()
    val secondechars = this.lowercase().toList().sorted()
}