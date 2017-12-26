fun main(args:Array<String>) {

    var map = hashMapOf(1 to "ethan", 2 to "shin")
    map.put(3, "avoirom")
    println(map.get(3))
    println(map[3])

    var arr = arrayOf(1, 10, 22, 11)
    println(arr[0])
    
    //var list = listOf(11, 22, 33, 22)
    var list = mutableListOf(11, 22, 33, 22)
    list[0] = 22

    for(item in list) {
        println(item)
    }
}