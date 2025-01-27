package OOPS

class OuterClass{
    val des:String="This is outer Class"
    fun desc(){
        println(des)
    }
    class NestedClass{
        private var id :Int=55
        fun displayId(){
            println("This will displays the details of inner class $id")
        }
    }
}
//fun main(){
//    var o1=OuterClass()
//    println(o1.desc())
//    var nest=OuterClass.NestedClass()
//    println(nest.displayId())
//}


class Outer{
    private val des:String="This is the Outer Class"
    fun desc(){
        println(des)
    }
    inner class InnerClass{
        private val id:Int=67
         fun innerId(){
            println(id)
            println(des)
            println(desc())
        }
    }
}

fun main(){
    var o1=Outer()
    println(o1.desc())
    var innerO2=Outer().InnerClass()
    println(innerO2.innerId())

}