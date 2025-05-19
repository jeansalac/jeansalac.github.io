// Kotlin version of Heap code from
// https://www.programiz.com/dsa/heap-data-structure
// Ported by Dave Musicant
// Adapted by Jean for in-class lab

interface Heap{
    fun heapify(hT: MutableList<Int>, i: Int)
    fun insert(hT: MutableList<Int>, newNum: Int)
    fun deleteNode(hT: MutableList<Int>, num: Int)
}

// MaxHeap Implementation
class MaxHeap: Heap {
    override fun heapify(hT: MutableList<Int>, i: Int) {
        var largest = i
        var l = 2 * i + 1
        var r = 2 * i + 2
        if (l < hT.count() && hT.get(l) > hT.get(largest))
            largest = l
        if (r < hT.count() && hT.get(r) > hT.get(largest))
            largest = r

        if (largest != i) {
            val temp = hT.get(largest)
            hT.set(largest, hT.get(i))
            hT.set(i, temp)

            heapify(hT, largest)
        }
    }

    override fun insert(hT: MutableList<Int>, newNum: Int) {
        val size = hT.count()
        if (size == 0) {
            hT.add(newNum)
        } else {
            hT.add(newNum)
            for (i in (size/2-1) downTo 0) {
                heapify(hT, i)
            }
        }
    }

    override fun deleteNode(hT: MutableList<Int>, num: Int) {
        val size = hT.count()
        var deleteIndex: Int = -1
        for (i in 0..<size) {
            if (num == hT.get(i)) {
                deleteIndex = i
                break
            }
        }

        var temp = hT.get(deleteIndex)
        hT.set(deleteIndex, hT.get(size-1))
        hT.set(size-1, temp)

        hT.remove(size-1)
        for (j in size/2-1 downTo 0)
            heapify(hT, j)
    }
}

// Implement Min-Heap based on Max-Heap code above

fun main() {
    // List representation of Min-Heap from Prep
    val list = listOf(4, 23, 12, 35, 36, 35, 14, 39, 42)

    // Initalize a Min-Heap object

    // Insert 11 into the Min-Heap and print out the list

    // Insert 2 into the Min-Heap and print out the list

    // Delete 14 from the Min-Heap and print out the list

    // Delete 4 from the Min-Heap and print out the list

}