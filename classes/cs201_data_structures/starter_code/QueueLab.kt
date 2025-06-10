// Ported by Dave Musicant, Adaped by Jean for in-class lab

// Kotlin version of queue code from
// https://www.programiz.com/dsa/queue (Python version)
// This is the easier, non-circular version, that wastes space at front as queue grows
// (One could just delete content at front and slide things down every time, but that's
// really slow)
class Queue<T> {

    // As a mutable list, it will grow as need be
    private val items = mutableListOf<T>()
    private var front = -1
    private var rear = -1


    fun isEmpty(): Boolean {
        return front == -1
    }

    fun enqueue(item: T) {
        if (front == -1) {
            front = 0
        }
        rear++
        if (items.size > rear) {
            items[rear] = item
        } else {
            items.add(item)
        }
    }

    fun dequeue(): T {
        if (isEmpty()) {
            throw Exception("Queue is empty.")
        }

        val item = items[front]
        if (front >= rear) {
            front = -1
            rear = -1
        } // There was only one element, so we reset after deleting.
        else {
            front++
        }

        return item
    }

    override fun toString(): String {
        return items.subList(front, rear+1).toString()
    }

    fun display() {
        println()
        if (isEmpty()) {
            println("Empty queue")
        } else {
            println("Front index-> " + front)
            println("Items -> ")
            for (i in front..rear) {
                println(items[i].toString() + " ")

            }
            println("Rear index-> " + rear)
        }
    }
}

// Driver code
fun main() {
    val exampleQueue = Queue<String>()
    
    // Set up the queue from prep & display
    /* YOUR CODE HERE */

    // Q1: Call dequeue() on the queue and display
    /* YOUR CODE HERE */

    // Q2: Call enqueue("Nick") on the queue and display
    /* YOUR CODE HERE */

}