fun main() {

    val intValue: Int = 10
    println("Integer value: $intValue")

    val doubleValueFromInt: Double = intValue.toDouble()
    println("Double value (from integer): $doubleValueFromInt")

    val stringValue: String = "10"
    println("String value: $stringValue")

    val intValueFromString1: Int = stringValue.toInt()
    println("Integer value1 (from string): $intValueFromString1")

    val intValueFromString2: Int = stringValue.toInt()
    println("Integer value2 (from string): $intValueFromString2")
    val doubleValueFromString: Double = "11.12".toDouble()
    println("Double value (from string): $doubleValueFromString")
}
