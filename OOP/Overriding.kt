open class Operations() {

    open fun sum(n1: Int, n2: Int): Int {
        return n1 + n2
    }
}

class MultiOperations(): Operations() {

    override fun sum(n1: Int, n2: Int): Int {
        return n1 + n2 * 3
    }
}

fun main(args:Array<String>) {

    var op = Operations()
    var sum = op.sum(10, 15)
    println("sum: $sum")        // 25

    var op2 = MultiOperations()
    sum = op2.sum(10, 15)
    println("sum: $sum")        // 55
}