import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val intList = ArrayList<Int>()

    for (i in 1..5) {
        print("a[i] $i: ")
        val element = scanner.nextInt()
        intList.add(element)
    }

    val maxNumber = intList.maxOrNull()

    if (maxNumber != null) {
        println("Largest Element: $maxNumber")
    } else {
        println("The list is empty.")
    }
}
