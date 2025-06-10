// Modified from Prof. Dave Musicant's example: https://github.com/dmusican/cs201f24share/blob/main/code-for-readings/src/main/kotlin/Stack.kt
class Stack<T>(){

    private val list:MutableList<T> = mutableListOf<T>()

    fun isEmpty(): Boolean {
        return list.size == 0
    }

    fun push(item: T) {
        list.add(item)
    }

    fun pop(): T {
        if (list.size == 0) {
            throw Exception("Stack is empty.")
        }

        return list.removeLast()
    }

    fun top(): T {
        if (list.size == 0) {
            throw Exception("Stack is empty.")
        }

        return list[list.size-1]
    }

    override fun toString(): String {
        return list.toString()
    }
}

// Driver code
fun main() {
    val s = Stack<String>()
    // Set up the stack from prep
    /* YOUR CODE HERE */

    // Top
    println("Top of the Stack: ${/* YOUR CODE HERE */}")
    println("Status of Stack after top: ${s}")

    // Pop
    println("${/* YOUR CODE HERE */} popped off the stack!")
    println("Status of Stack after pop: ${s}")

    // Push
    /* YOUR CODE HERE */
    println("Status of Stack after push: ${s}")

}