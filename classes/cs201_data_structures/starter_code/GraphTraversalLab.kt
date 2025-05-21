// Adapted from Dave Musicant's in-class lab by Jean Salac

class Graph(var numVertices: Int) {

    var adjacencyMatrix = MutableList(numVertices) {MutableList(numVertices) {false}}

    fun addEdge(vertex1: Int, vertex2: Int) {
        adjacencyMatrix[vertex1][vertex2] = true
        adjacencyMatrix[vertex2][vertex1] = true
    }

    fun depthFirstDisplay(startVertex: Int) {
        val visited = MutableList(numVertices) {false}
        _depthFirstDisplay(startVertex, visited)
    }

    private fun _depthFirstDisplay(vertex: Int, visited: MutableList<Boolean>) {

        if (/*YOUR CODE HERE */) {
            return
        } else {
            visited[vertex] = true
            println("Visiting " + vertex)
            for (j in 0..<numVertices) {

                if (/*YOUR CODE HERE */) {

                    _depthFirstDisplay(/*YOUR CODE HERE */, /*YOUR CODE HERE */)
                }
            }
        }
    }

    fun breadthFirstDisplay(vertex: Int) {
        var queue = ArrayDeque<Int>()
        val visited = MutableList(numVertices) {false}

        visited[vertex] = true
        println("Visiting " + vertex)

        queue.addLast(/*YOUR CODE HERE */)

        while (!queue.isEmpty()) {

            val currentVertex = queue.removeFirst()

            for (next in 0..<numVertices) {

                if (/*YOUR CODE HERE */) {

                    visited[/*YOUR CODE HERE */] = true
                    println("Visiting " + next)

                    queue.addLast(/*YOUR CODE HERE */)
                }
            }
        }
    }
}

fun main() {
    // Create a graph
    val graph = Graph(numVertices=4)
    graph.addEdge(0, 1)
    graph.addEdge(1, 2)
    graph.addEdge(2, 3)

    // Test DFS
    println("Depth first:")
    graph.depthFirstDisplay(2)

    // Test BFS
    println("Breadth first:")
    graph.breadthFirstDisplay(2)
}
