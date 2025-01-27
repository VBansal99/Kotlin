package OOPS

open class ProtectedModifiers{
     protected open val i=0
}
class SubClass:ProtectedModifiers(){
    override val i=10
    fun getValue():Int{
        return i
    }
}
fun main(){
    val ob1=SubClass()
    println(ob1.getValue())
}


open class Base(){
    var a=1
    private var b=2
    protected open var c=3
    internal open var d=4
}
class Derived:Base(){
    override var c=9
    override var d=8
}