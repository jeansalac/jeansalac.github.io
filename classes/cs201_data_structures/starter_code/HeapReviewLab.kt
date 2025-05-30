// Heap Implementation with Percolate Up & Down

interface Heap{
    fun heapify(list: MutableList<Int>)
    fun insert(list: MutableList<Int>, newNum: Int)
    fun delete(list: MutableList<Int>, num: Int)
}

// Max-Heap Implementation
class MaxHeap: Heap {
    fun percolate(list: MutableList<Int>, curNode: Int, swapNode: Int){
        var tmp = list[curNode]
        list[curNode] = list[swapNode]
        list[swapNode] = tmp
    }
    
    override fun heapify(list: MutableList<Int>) {
        // Start with parent of rightmost leaf node
        for(curNode in (list.size/2) - 1 downTo 0){
            // Compare current node with its parent
            
            // Check if current node is a left or a right child
            var parent = if (/*YOUR CODE HERE */) /*YOUR CODE HERE */ else /*YOUR CODE HERE */

            // Check if parent is in bounds
            if(/*YOUR CODE HERE */){
                // If current node is larger than its parent, percolate up
                if(/*YOUR CODE HERE */){
                    percolate(/*YOUR CODE HERE */)
                }
            }

            // Compare current node with its children
            var leftChild = /*YOUR CODE HERE */
            var rightChild = /*YOUR CODE HERE */

            // First, check if children are in bounds
            // If current node is smaller than its children, percolate down
            if(/*YOUR CODE HERE */){
                if(/*YOUR CODE HERE */){
                    percolate(/*YOUR CODE HERE */)
                }
            }

            if(/*YOUR CODE HERE */){
                if(/*YOUR CODE HERE */){
                    percolate(/*YOUR CODE HERE */)
                }
            }
            
        }
    }

    override fun insert(list: MutableList<Int>, newNum: Int){
        if(list.size == 0 ){
            list.add(newNum)
        }

        else if(list.size == 1){
            list.add(newNum)
            if (/*YOUR CODE HERE */){
                percolate(/*YOUR CODE HERE */)
            }
        }
        
        else{
            list.add(newNum)
            var newNumIndex = list.size - 1
            var parent = if (newNumIndex%2 == 1) (newNumIndex-1) / 2 else (newNumIndex-2) / 2

            // While new node is larger than its parent, percolate up
            while(/*YOUR CODE HERE */){
                percolate(/*YOUR CODE HERE */)
                newNumIndex = /*YOUR CODE HERE */

                //If you're at the root, break
                if (newNumIndex == 0){
                    break
                } else{
                    parent = if (/*YOUR CODE HERE */) /*YOUR CODE HERE */ else /*YOUR CODE HERE */
                }
            }
        }   
    }

    override fun delete(list: MutableList<Int>, num: Int){
        var deleteIndex: Int = -1

        // Find the item to be deleted
        for (i in 0..<list.size) {
            if (num == list.get(i)) {
                deleteIndex = i
                break
            }
        }

        // Move the last item in the heap into the index of the deleted node
        list[deleteIndex] = /*YOUR CODE HERE */
        list.removeLast()

        // Re-heapify
        heapify(list)
        
    }

}

fun main(){
    val listToHeap = mutableListOf<Int>()

    val maxHeap = MaxHeap()

    maxHeap.insert(listToHeap, 3)

    maxHeap.insert(listToHeap, 4)

    maxHeap.insert(listToHeap, 9)

    maxHeap.insert(listToHeap, 5)

    maxHeap.insert(listToHeap, 2)
    println(listToHeap)

    maxHeap.delete(listToHeap, 9)
    println(listToHeap)
    

}