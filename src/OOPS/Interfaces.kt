package OOPS

interface myInterfaces{
    val id:Int
    fun absMethod()
    fun doSomething(){

    }
}

interface MyInterface{
    val id:Int
    fun absMethod()
    fun doSomething(){
        println("This is not an abstract method")
    }
}
class ImplInterface:MyInterface{
    override val id: Int=10
    override fun absMethod() {
        println("This is an abstract method")
    }
}
interface MyInterface1{
    fun absMethod()
}
interface MyInterface2{
    fun absMethod1()
}

class ImplMulInterfaces:MyInterface1,MyInterface2{
    override fun absMethod() {
        println("My Interface 1 method will be implemented")
    }

    override fun absMethod1() {
        println("My interface 2 method will be implemented")
    }
}

interface MyInterface3{
    fun doSomething(){
        println("My Interface 3 will work")
    }
}
interface MyInterface4{
    fun doSomething(){
        println("My Interface 4 will work")
    }
}
//class ImplNewInterfaces:MyInterface3,MyInterface4{
//    override fun doSomething() {
//        super<MyInterface3>.doSomething()
//    }
//    override fun doSomething() {
//        super<MyInterface3>.doSomething()
//    }
//}
fun main(){
//    val ob1=ImplInterface()
//    println(ob1.id)
//    ob1.absMethod()
//    ob1.doSomething()

    val ob2=ImplMulInterfaces()
    ob2.absMethod()
    ob2.absMethod1()
}