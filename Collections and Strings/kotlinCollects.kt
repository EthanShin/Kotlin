fun main(args:Array<String>) {

    println("Array")
    var arr = arrayOf(1, 10, 22, 11)
    println(arr[0])             // 1

    println("List(read-only)")
    var list = listOf(11, 22, 33, 22)
    println(list[0])            // 11
    //list[0] = 33              // error : read-only

    println("Mutable List(read/write)")
    var mutablelist = mutableListOf(11, 22, 33, 22)
    mutablelist.add(0, 44)
    println(mutablelist[0])     // 44
    mutablelist.removeAt(0)
    println(mutablelist[0])     // 11
    mutablelist[0] = 33
    println(mutablelist[0])     // 33
}