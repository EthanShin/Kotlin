fun main(args:Array<String>) {
    
    var map = HashMap<Int, String>()
    map.put(1, "Ethan")
    map.put(2, "Shin")
    println(map.get(2))

    
    map.put(1, "Byeongki")
    for(k in  map.keys) {
        println(map.get(k))˜
    }
}