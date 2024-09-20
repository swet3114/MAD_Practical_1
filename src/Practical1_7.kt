fun factorial(n: Int): Int {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}

tailrec fun factorialTailRec(n: Int, accumulator: Int = 1): Int {
    return if (n == 0 || n == 1) {
        accumulator
    } else {
        factorialTailRec(n - 1, n * accumulator)
    }
}

fun main() {
    print("Enter a number: ")
    val input = readLine() ?: "0"
    val number = input.toIntOrNull() ?: 0

    val result = factorial(number)
    val result1 = factorialTailRec(number)

    println("The factorial of $number = $result")
    println("By Tailrec keyword, Factorial of $number = $result1")
}
