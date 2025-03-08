import java.util.Scanner

fun factorial(n: Int): Long {
    require(n >= 0) { "Factorial is not defined for negative numbers" }
    return if (n == 0 || n == 1) 1 else n * factorial(n - 1)
}

fun getOddNumbersFromList(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (n in list) {
        if (n % 2 != 0) {
            result.add(n)
        }
    }
    return result
}

fun calculator() {
    val scanner = Scanner(System.`in`)
    println("\nSimple Calculator")
    println("Choose an operation: +, -, *, /, % (or type 'exit' to quit)")
    println("-----------------------------------------------------------")
    while (true) {
        print("Enter operation: ")
        val operation = scanner.next()

        if (operation == "exit") {
            println("Exiting calculator. Goodbye!")
            break
        }

        print("Enter first number: ")
        val num1 = scanner.nextDouble()

        print("Enter second number: ")
        val num2 = scanner.nextDouble()

        val result = when (operation) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 != 0.0) num1 / num2 else "Error: Division by zero!"
            "%" -> num1 % num2
            else -> "Invalid operation"
        }

        println("$num1 $operation $num2 = $result")
        println("----------------------------")
    }
}


fun main() {
    // 1- Test factorial function:
    print("please enter the number: ")
    val number = readln().toInt()
    println("Factorial of $number = ${factorial(number)}")
    println("----------------------------")

    // 2- Test getOddNumbersFromList function:
    print("please enter the list: ")
    val numbers = readln().split(" ").map { it.toInt() }
    println("Odd numbers in your list = ${getOddNumbersFromList(numbers)}")
    println("----------------------------")

    // 3- Test calculator function:
    calculator()
}