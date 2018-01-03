class Car() {

    var type: String?=null
    var model: Int?=null
    var price: Double?=null
    var milesDrive: Int?=null
    var owner: String?=null

    constructor(type: String, model: Int, price: Double, milesDrive: Int, owner: String): this() {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
        println("constructor1")
    }

    constructor(owner: String): this() {
        this.owner = owner
        println("constructor2")
    }

    fun getCarPrice(): Double {
        return this.price!! - (this.milesDrive!!.toDouble() * 10)
    }
}

fun main(args: Array<String>) {

    val car = Car("BMW", 2017, 10000.0, 105, "Ethan Shin")
    println("my car: " + car.getCarPrice())

    val car2 = Car("Byeongki")
}