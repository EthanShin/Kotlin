fun main(args:Array<String>) {
    var arraylist = arraylist<String>()
    arraylist.add("Avoirom")
    arraylist.add("Shin")

    println("First name:" + arraylist.get(0))
    arraylist.set(0, "Ethan")

    println(" all element by object")
    for(item in arraylist) {
        println(item)
    }

    println(" all element by index") 
    for(index in 0..arraylist.size-1) {
        println(arraylist.get(index))
    }

    if(arraylist.contains("Shin")) {
        println(" name is found")
    } else {
        println(" name is not found")
    }
}