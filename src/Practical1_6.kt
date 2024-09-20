fun mpg(a: Int, b: Int, c: Int, operation: String): Int {
    return when (operation) {
        "addition" -> a + b + c
        "subtraction" -> a - b - c
        "multiplication" -> a * b * c
        "division" -> {
            if (b == 0 || c == 0) {
                println("Division by zero is not allowed.")
                return 0
            }
            a / b / c
        }
        else -> {
            println("Invalid operation type.")
            return 0
        }
    }
}

fun main() {
    val num1 = 111
    val num2 = 2222
    val num3 = -222

    println("Addition of $num1, $num2, $num3 is ${mpg(num1, num2, num3, "addition")}")
    println("Subtraction of $num1, $num2, $num3 is ${mpg(num1, num2, num3, "subtraction")}")
    println("Multiplication of $num1, $num2, $num3 is ${mpg(num1, num2, num3, "multiplication")}")
    println("Division of $num1, $num2, $num3 is ${mpg(num1, num2, num3, "division")}")
}
