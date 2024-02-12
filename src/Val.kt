//val is read-only, not immutable
//for example:

fun main() {
    val myRectangle = rectangle()
    println(myRectangle.calculate)
}

class rectangle{
    var shortEdge: Int = 15
    var longEdge: Int = 25

    val calculate: Int
        get(){
            return shortEdge * longEdge
        }
}