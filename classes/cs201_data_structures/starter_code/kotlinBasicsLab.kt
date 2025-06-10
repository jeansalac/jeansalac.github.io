fun main() {
    // Test your solution for Prep Question 1!

    // Number of classes with each letter grade
    val numA = 12
    val numAminus = 14
    val numBplus = 6
    val numB = 4

    // Start of lines in wrong order

    totalGradePoints = totalGradePoints + numBplus * 3.333

    val gpa = String.format("%.2f", totalGradePoints / totalClasses)

    totalGradePoints = totalGradePoints + numB * 3.0

    var totalGradePoints :Double = 0.0

    totalGradePoints = totalGradePoints + numAminus * 3.667

    val totalClasses = numA + numAminus + numBplus + numB

    totalGradePoints = totalGradePoints + numA * 4.0

    // End of lines in wrong order

    println("Student's GPA: ${gpa}")

    // Un-comment the lines below to test your solution for Prep Question 2! 

    // println("Student's GPA: ${calculateGPA(listOf("A-", "B+", "C", "A"))}")
    // println("Student's GPA: ${calculateGPA(listOf("C-", "B", "D+", "A-"))}")
	// println("Student's GPA: ${calculateGPA(listOf("F", "A-", "C+", "B-"))}")

    // Un-comment the lines below to test your solution for the Bonus Question!

    // println("Student's GPA: ${calculateGPAmap(listOf("A-", "B+", "C", "A"))}")
    // println("Student's GPA: ${calculateGPAmap(listOf("C-", "B", "D+", "A-"))}")
	// println("Student's GPA: ${calculateGPAmap(listOf("F", "A-", "C+", "B-"))}")

}

// Test your solution for Prep Question 2
fun calculateGPA(grades: /* YOUR CODE HERE */) : /* YOUR CODE HERE */ {
	
    var totalGradePoints:Double = 0.0

	//Missing code to iterate over the list
	
	// Missing the conditions for other letter grades
	when(grade){
        "A" -> totalGradePoints += 4.0
    }

    val gpa = String.format("%.2f", totalGradePoints / grades.count())
   
    return gpa
}

// Bonus: More efficient version of calculate GPA using a map
fun calculateGPAmap(grades:/* YOUR CODE HERE */): /* YOUR CODE HERE */{

    val gpaMap: /* YOUR CODE HERE */ = mapOf("A" to 4.0, /* YOUR CODE HERE */)

    var totalGradePoints:Double = 0.0

    for (/* YOUR CODE HERE */){
        if (gpaMap[grade] != null){
            /* YOUR CODE HERE */
        }
    }
    
    val gpa = String.format("%.2f", totalGradePoints/grades.count())
    
    return gpa
}

