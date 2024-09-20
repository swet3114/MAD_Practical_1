fun main() {

    print("Enter Enrollment No.: ")
    val enrollmentNo: String = readln()

    print("Enter Name: ")
    val name: String = readln()

    print("Enter Branch: ")
    val branch: String = readln()

    print("Enter Class: ")
    val studentClass: String = readln()

    print("Enter Batch: ")
    val batch: String = readln()

    print("Enter College Name: ")
    val collegeName: String = readln()

    print("Enter University Name: ")
    val universityName: String = readln()

    print("Enter Age: ")
    val age: Int = readln().toIntOrNull() ?: 0


    println("\n*********************")
    println("Student Data:")
    println("Enrollment No.: $enrollmentNo")
    println("Name: $name")
    println("Branch: $branch")
    println("Class: $studentClass")
    println("Batch: $batch")
    println("College Name: $collegeName")
    println("University Name: $universityName")
    println("Age: $age")
}
