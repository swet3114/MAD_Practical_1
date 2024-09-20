fun main() {
    println("Enter any number")
    val number = readln().toInt()
    println(
        if (number % 2 == 0) {
            "$number is zero"
        } else {
            "$number is odd"
        }
    )
}
