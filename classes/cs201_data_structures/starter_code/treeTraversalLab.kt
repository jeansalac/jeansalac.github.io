// Binary Search Tree operations
// Tree traversal in Kotlin
// Ported to Kotlin by Dave Musicant
// Adapted for in-class lab by Jean Salac

class BinarySearchTree {

    data class Node(var item: Int,
                    var left: Node? = null,
                    var right: Node? = null)

    var root: Node? = null

    fun insert(item: Int) {
        root = insertItem(root, item)
    }

    // Insert item in the tree
    private fun insertItem(root: Node?, item: Int): Node? {
        // Return a new node if the tree is empty
        if (root == null) {
            return Node(item)
        }

        // Traverse to the right place and insert the node
        if (item < root.item) {
            root.left = insertItem(root.left, item)
        } else if (item > root.item) {
            root.right = insertItem(root.right, item)
        }

        return root
    }

    // Print Preorder Traversal
    fun preorder(root: Node?) {

    }

    // Print Inorder Traversal
    fun inorder(root: Node?){
       
    }

    // Print Postorder Traversal
    fun postorder(root: Node?) {
        
    }
}

// Driver Program to test above functions
fun main() {
    val tree = BinarySearchTree()

    // Tree Setup
    tree.insert(9)
    tree.insert(4)
    tree.insert(11)
    tree.insert(2)
    tree.insert(7)

    // Testing Preorder Traversal
    print("Preorder traversal: ")
    tree.preorder(tree.root)
    print("\n")

    // Testing Inorder Traversal
    print("Inorder traversal: ")
    tree.inorder(tree.root)
    print("\n")

    // Testing Postorder Traversal
    print("Postorder traversal: ")
    tree.postorder(tree.root)
    print("\n")

}