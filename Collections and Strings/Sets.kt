fun main(args:Array<String>) {

    var setElements = setOf(1, 2, 3, 11, 44, 55, 55)
    //setElements.add(77)       not work
    for(element in setElements) {
        println(element)    // 1, 2, 3 ,11, 44, 55
    }

    var mutableSetElements = mutableSetOf(1, 2, 3, 11, 44, 55, 55)
    mutableSetElements.add(77)
    for(element in mutableSetElements) {
        println(element)    // 1, 2, 3, 11, 44, 55, 77
    }
}