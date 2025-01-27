package OOPS

abstract class Car{
    abstract fun run()
}
class Honda:Car(){
    override fun run() {
        println("Honda car is running safely")
    }
}

//fun main(){
//    val h1=Honda()
//    h1.run()
//}

open class Car1{
    open fun run(){
        println("This is running")
    }
}
abstract class NewCar:Car1(){
    abstract override fun run()
}

class Honda1:NewCar(){
    override fun run() {
        println("This is a Honda car")
    }
}

fun main(){
    val h1=Honda1()
    h1.run()
}