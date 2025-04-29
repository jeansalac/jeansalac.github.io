// Given a list of numbers, return the largest number
fun findMax(numList: List<Int>): Int{
    return 0
}

// Given a list of numbers, return the sum of all the numbers in the list
fun sumList(numList: List<Int>): Int{
    return 0
}

// Given a number, return its factorial (multiplication of itself & its preceding numbers)
// e.g. fact(3) = 3 * 2 * 1
fun fact(startNum: Int): Int{
    return 0

}

// Given a position, return the fibonacci number at position
// Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, starting from 0 and 1.
// Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34…
// e.g. fib(6) = 8
fun fib(position: Int):Int{
    return 0
}

fun main(){
    //Testing findMax()
    println("Solution to findMax: ${findMax(listOf(26, 30, 8))}")
    println("Solution to findMax: ${findMax(listOf(-19, -61))}")
    println("Solution to findMax: ${findMax(listOf(-1))}")
    println("Solution to findMax: ${findMax(listOf<Int>())}")

    //Testing sumList()
    println("Solution to sumList: ${sumList(listOf(-6, 4, 12))}")
    println("Solution to sumList: ${sumList(listOf(-47, 53))}")
    println("Solution to sumList: ${sumList(listOf(-5))}")
    println("Solution to sumList: ${sumList(listOf<Int>())}")

    // Testing fact()
    println("Solution to factorial:${fact(3)}")
    println("Solution to factoria:${fact(5)}")
    println("Solution to factoria:${fact(7)}")
    println("Solution to factorial:${fact(0)}")

    // Testing fib()
    println("Solution to fib:${fib(6)}")
    println("Solution to fib:${fib(10)}")
    println("Solution to fib:${fib(1)}")
    println("Solution to fib:${fib(0)}")

}