package OOPS

import java.util.*

class cons(val name:String, var id:Int){

}
//fun main(){
//    var c1=cons("Anshu",101)
//    println("Name is ${c1.name}")
//    println("Id is:- ${c1.id}")
//}
class cons1(name: String,id:Int){
    //with init block
    val e_name:String
    var e_id:Int
    init {
        e_name= name.uppercase(Locale.getDefault()).trim()
        e_id=id
        println("Name is:- $e_name")
        println("Id is:- $e_id")
    }
}
//fun main(){
//    var co=cons1("Anshu",101)
//}

class SecondaryConstructor{
    constructor(name:String,id: Int){
        println("Name is:- $name")
        println("Id is:- $id")
    }
}
//fun main(){
//    val s1=SecondaryConstructor("Anshu",103)
//}

class SecondaryConstructor1(password:String){
    constructor(name:String ,id: Int,password: String):this(password){
        println("Name is:- $name")
        println("Id is:- $id")
        println("Password is:- $password")
    }
}
//fun main(){
//    val i1=SecondaryConstructor1("Anshu",104,"Yo Boi")
//}

class SecondaryConstructor2{
    constructor(name:String, id:Int):this(name,id," password = String.toString()"){
        println("No I")
        println("Name is:- $name")
        println("Id is:- $id")
    }

    constructor(name: String, id: Int,password: String){
        println("I Execute first")
        println("Name is:- $name")
        println("Id is:- $id")
        println("Password is:- $password")
    }
}
//fun main(){
//    val p1=SecondaryConstructor2("Anshu ",101)
//}

open class Parent{
    constructor(name: String,id:Int){
        println("I am first secondary constructor of parent class")
        println("Name is $name")
        println("Id is $id")
    }
    constructor(name: String,id: Int,password: String){
        println("I am the second Secondary constructor of parent class")
        println("Name is:- $name")
        println("Id is:- $id")
        println("Password is:- $password")
    }
}
class Child: Parent {
    constructor(name: String,id: Int):super(name,id){
        println("I am the first secondary child constructor")
        println("Name is:- $name")
        println("Id is:- $id")
    }

    constructor(name: String,id: Int,password: String):super(name, id, password){
        println("I am the second secondary child constructor")
        println("Name is:- $name")
        println("Id is:- $id")
        println("Password is:- $password")
    }
}

fun main(){
    val ob1=Child("Varun ",101)
    val ob2=Child("Bansal",102,"p111111")
}