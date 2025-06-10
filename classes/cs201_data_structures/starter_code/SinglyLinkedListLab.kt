// Kotlin version of linked list code from
// https://www.geeksforgeeks.org/singly-linked-list-tutorial/
// Ported by Dave Musicant, Adapted by Jean for in-class lab

class SinglyLinkedList<T> {

    private data class Node<T>(
        var item: T,
        var next: Node<T>?)

    private var head: Node<T>? = null

    override fun toString(): String {
        var result = ""
        var current = head
        while (current != null) {
            result = result + current.item + " --> "
            current = current.next
        }
        result = result + "NULL"
        return result.trim()
    }

    fun search(target: T): Boolean {
        var current = head
        while (current != null) {
            if (current.item == target) {
                return true
            }
            current = current.next
        }
        return false
    }

    fun length(): Int {
        var length = 0
        var current = head
        while (current != null) {
            length++
            current = current.next
        }
        return length
    }

    fun insertAtBeginning(item: T) {
        val newNode = Node(item, null)
        newNode.next = head
        head = newNode
    }

    fun insertAtEnd(item: T) {
        val newNode = Node(item, null)

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode
            return
        }

        var current = head
        // current cannot be null because just checked, and are checking through loop
        while (current!!.next != null) {
            current = current.next
        }
        current.next = newNode
    }

    fun insertAtPosition(position: Int, item: T) {
        if (position < 0) {
            throw Exception("Invalid position!")
        }

        else if (position == 0) {
            insertAtBeginning(item)
        }

        else {
            var current = head
            for (skips in 0..<position-1) {
                // current cannot be null because just checked head
                // first time, and then checked immediately afterwards
                current = current!!.next
                if (current == null) {
                    throw Exception("List not long enough!")
                }
            }
            // current cannot be null because just checked
            val temp = Node(item, current!!.next)
            current.next = temp
        }
    }

    fun removeFirstNode() {
        val current = head
        if (current == null) {
            throw Exception("List is empty!")
        } else {
            head = current.next
        }
    }

    fun removeLastNode() {
        var current = head

        // If the list is empty, do nothing
        if (current == null) {
            return
        }

        // If the list has only one node, delete it
        if (current.next == null) {
            head = null
            return
        }

        // Have already verified there are at least two nodes
        while (current!!.next!!.next != null) {
            current = current.next
        }

        // Remove the last node
        current.next = null
    }


    fun deleteAtPosition(position: Int) {
        var current = head

        // If the list is empty or the position is invalid
        if (current == null || position < 0) {
            throw Exception("Invalid position!")
        }

        // If the head needs to be deleted
        if (position == 0) {
            head = current.next
        }

        // Traverse to the node before the position to be deleted
        for (skips in 0..<position-1) {
            // current cannot be null because just checked head
            // first time, and then checked immediately afterwards
            current = current!!.next
            if (current == null) {
                throw Exception("List not long enough!")
            }
        }

        // Verify position was not too large
        if (current!!.next == null) {
            throw Exception("List not long enough!")
        }

        current.next = current.next!!.next
    }
}


fun main() {
   
    val exampleList = SinglyLinkedList<String>()
     // Set up the example linked list from prep
     /* YOUR CODE HERE */

    // Q1: Insert the node “Great Hall will be on your left” at the end of the linked list & print the result
    /* YOUR CODE HERE */

    // Q3: Remove the first node from the linked list & print the result
    /* YOUR CODE HERE */

}