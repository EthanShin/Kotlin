open class Operations() {

    protected var ProcessName: String?=null
    fun sum(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    fun div(n1: Int, n2: Int): Int {
        return n1 / n2
    }
}

class MultiOperations(): Operations() {

    fun sub(n1: Int, n2: Int): Int {
        return n1 - n2
    }

    fun mul(n1: Int, n2: Int): Int {
        return n1 * n2
    }

    fun GetName() {
        super.ProcessName
    }
}

fun main(args:Array<String>) {

    var op = Operations()
    var sum = op.sum(10, 15)
    println("sum: $sum")
    var div = op.div(12, 11)
    println("div: $div")

    var op2 = MultiOperations()
    sum = op2.sum(10, 15)
    println("sum: $sum")
    div = op2.div(12, 11)
    println("div: $div")
    var sub = op2.sub(20, 12)
    println("sub: $sub")
    var mul = op2.mul(3, 4)
    println("mul: $mul")

    println("ProcessName: " + op.GetName())
}