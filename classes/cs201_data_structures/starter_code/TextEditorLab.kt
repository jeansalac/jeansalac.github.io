class TextEditor(){
    //Stack of actions
    val actionStack: MutableList<String> = mutableListOf<String>()

    //Stack of undone actions
    val undoStack: MutableList<String> = mutableListOf<String>()

    fun performAction(action: String){
        actionStack.add(action)
    }
    
    fun undo(){
        if (actionStack.isNotEmpty()){
            var undoneAction = actionStack.removeLast()
            undoStack.add(undoneAction)
        }
    }

    fun redo(){
        if (undoStack.size > 0){
            var redoneAction = undoStack.removeLast()
            actionStack.add(redoneAction)
        }
    }
}

fun main(){
    val docsEditor = TextEditor()
    docsEditor.performAction("d")
    docsEditor.performAction("o")
    docsEditor.performAction("g")
    println(docsEditor.actionStack)
    println(docsEditor.undoStack)

    // Q1: undo() is called. Print the result on each of the stacks.
    /* YOUR CODE HERE */

    // Q2: redo() is called. Print the result on each of the stacks.
    /* YOUR CODE HERE */

    // Q3: You want to type “dish”, instead of “dog”. 
    // Using the member functions of TextEditor, how would you type “dish” instead of “dog”?

    // Q4: Print the result on each of the stacks after trying to type "dish", instead of "dog"
    /* YOUR CODE HERE */


}