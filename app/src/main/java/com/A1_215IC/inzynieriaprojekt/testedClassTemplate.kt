object testMe {

    /**
     * the input is not valid if...
     * ...the number is greater than 2
     * ... the number is lower than 10
     */

    fun validateThis(n: Int): Boolean {
        return n in 3..9
    }
}