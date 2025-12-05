/**
 * In class lab for learning about hash code functions
 * Based on Java lab by Anna Rafferty
 * Translated to Kotlin and updated by Anya Vostinar & Jean Salac
 */


class HashTable {
    var tableSize = 10
    //array of nulls to hold words, which are strings
    var words: Array<String?> = arrayOfNulls<String>(tableSize)

    /**
     * A hashing function that uses the alphabet order of the first character of a string (e.g. "a"=1, "b"=2,..., "z"=26).
     * @param s the string to hash
     * @return the hash code
     */
    fun hashCode1(s: String) : Int {
        //TODO
        return 0
    }

    /**
     * A hashing function that uses the sum of the alphabet orders of the characters in a string (e.g. "a"=1, "b"=2,..., "z"=26).
     * @param s the string to hash
     * @return the hash code
     */
    fun hashCode2(s: String) : Int {
        //TODO
        return 0
    }

    /**
     * BONUS!
     * A hashing function that uses the sum of the alphabet orders of the characters in a string,
     * weighted by the position of the character in the string.
     * @param s the string to hash
     * @return the hash code
     */
    fun hashCode3(s: String) : Int {
       //TODO
       return 0 
    }

    fun hashCodetoHashIndex(hashCode: Int) : Int {
        var hashIndex = hashCode % tableSize
        if(hashIndex >= 0) {
            return hashIndex
        } else {
            return hashIndex+tableSize
            //Mod of a negative number is negative - 
            //map back to positive so in the range of 
            //[0,numberOfBuckets)
        }
    }

    override fun toString() : String {
        var returnString = ""
        for(word in words) {
            returnString += word + " "
        }
        return returnString
    }

}

fun main() {
    var test = HashTable()
    println(test)

}