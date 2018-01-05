interface op {

    fun sum(n1: Int, n2: Int)
    fun div(n1: Int, n2: Int) {
        println("div: " + (n1/n2))
    }
}

class UserOp: op {

    override fun sum(n1: Int, n2: Int) {
        println("sum: " + (n1+n2))
    }

}

class AdminOp: op {

    override fun sum(n1: Int, n2: Int) {
        println("sum: " + (n1+n2-2))
    }

    override fun div(n1: Int, n2: Int) {
        println("div: " + (n1/n2-2))
    }
}

fun main(args:Array<String>) {

    var userop = UserOp()
    var adminop = AdminOp()
    userop.sum(3, 10)       // 13
    adminop.sum(3, 10)      // 11

    userop.div(4, 2)        // 2
    adminop.div(4, 2)       // 0
}