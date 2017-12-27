var fullname = "Ethan Shin"     // global var

fun display(): Unit {

    println(fullname)
    //println("name: $name")
}

fun main(args: Array<String>) {

    var name = "Ethan"          // local var
    println(fullname)
    println("name: $name")

}