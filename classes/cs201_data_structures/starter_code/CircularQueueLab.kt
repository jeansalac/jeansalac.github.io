// Ported by Dave Musicant, Adaped by Jean for in-class lab

// Kotlin version of circular queue code from
// https://www.programiz.com/dsa/circular-queue
// This is the circular version that wastes no space as the queue grows.
class CircularQueue<T> {

    // As a mutable list, it will grow as need be
    private var items = mutableListOf<T>()
    private var front = -1
    private var rear = -1


    fun isEmpty(): Boolean {
        return front == -1
    }

    fun enqueue(item: T) {

        // Case where item list is completely empty. Need to handle as a special
        // case because modular arithmetic for other cases will fail when list
        // has size 0.
        if (items.size == 0) {
            items.add(item)
            front = 0
            rear = 0
        }

        // Case where queue is empty, but item list is not of size 0
        else if (front == -1) {
            front = 0
            rear = 0
            items[0] = item
        }

        // Case where queue is completely full; this is when rear is one space
        // ahead of front
        else if (front == (rear + 1) % items.size) {
            // If front of the list is not at 0, then copy entire list to put front at 0.
            // Then can add item to end.
            if (front != 0){
                val newItems = mutableListOf<T>()
                newItems.addAll(items.subList(front, items.size))
                newItems.addAll(items.subList(0, rear+1))
                items = newItems
                front = 0
            }

            items.add(item)
            rear = items.size-1
        }

        // Final case, which means queue has room: can just add to rear and
        // increment
        else {
            rear = (rear + 1) % items.size
            items[rear] = item
        }
    }


    fun dequeue(): T {
        if (isEmpty()) {
            throw Exception("Queue is empty.")
        }

        val item = items[front]
        if (front == rear) {
            front = -1
            rear = -1
        } // There was only one element, so we reset after deleting.
        else {
            front = (front + 1) % items.size
        }

        return item
    }

    override fun toString(): String {
        var result = ""
        var i = front
        while (i != rear) {
            result = result + items[i].toString() + " "
            i = (i + 1) % items.size
        }
        result = result + items[i].toString()
        return result
    }

    fun display() {
        println()
        if (isEmpty()) {
            println("Empty queue")
        } else {
            println("Front index-> " + front)
            println("Items -> ")
            var i = front
            while (i != rear) {
                println(items[i].toString() + " ")
                i = (i + 1) % items.size
            }
            println(items[i].toString())
            println("Rear index-> " + rear)
        }
    }
}

// Driver code
fun main() {
    val exampleCircular = CircularQueue<String>()
    // Set up the circular queue from prep & display (Make sure the front & rear indices match too, not just the elements)
    /* YOUR CODE HERE */

    // Q3: Call enqueue("Gwen") on the circular queue and display
   /* YOUR CODE HERE */
    
    // Q4: Call dequeue() on the circular queue and display
    /* YOUR CODE HERE */

}