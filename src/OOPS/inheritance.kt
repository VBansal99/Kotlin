package OOPS

open class Base1{
    val x=10
}
class Derived1:Base1(){
    fun print(){
        println("The Value is:- $x")
    }
}

open class Bird{
    fun fly(){
        println("Birds can Fly")
    }
}
class Duck:Bird(){
    fun swim(){
        println("Bird can swim")
    }
}
//open class Employee(name:String,age:Int,salary:Float){
//init {
//    println("Name is:- $name")
//    println("Age is:-$age")
//    println("Salary is:- $salary")
//}
//}
//class Programmer(name :String,age: Int,salary: Float):Employee(name,age,salary){
//    fun doProgramming(){
//        println("Programming is my passion")
//    }
//}
//class Salesman(name: String,age: Int,salary: Float):Employee(name,age,salary){
//    fun hobby(){
//        println("Travelling is my hobby")
//    }
//}


open class Employee1(name:String,salary:Float){
    init {
        println("Name is:- $name")
        println("Salary is:- $salary")
    }
}
class Programmer1(name :String,dept:String,salary: Float):Employee1(name,salary){
    init {
        println("Name is $name Department is $dept Salary is $salary")
    }
    fun doProgramming(){
        println("Programming is my passion")
    }
}
class Salesman1(name: String,dept: String,salary: Float):Employee1(name,salary){
    init {
        println("Name is $name Department is $dept Salary is $salary")
    }
    fun hobby(){
        println("Travelling is my hobby")
    }
}

open class Patent{
    constructor(name:String,id:Int){
        println("Name is:- $name and Id is:- $id")
    }
}
class Child1:Patent{

    constructor(name: String,id:Int,dept:String):super(name,id){
        println("Child class will execute $name,$id,$dept")
    }
}

open class Birds{

    open fun fly(){
        println("Birds can fly")
    }
}
class Parrot:Birds(){

}
class Duck1:Birds(){

}

open class Bird2{
    open fun fly(){
        println("Birds can Fly")
    }
}
class Parrot1:Bird2(){
    override fun fly() {
        println("Parrot can Fly")
    }
}
class Duck2:Bird2(){
    override fun fly() {
        println("Duck can Fly")
    }
}

open class Bird3{
    open var color:String="Black"
    open fun fly(){
        println("Birds can fly and color is $color")
    }
}
class Parrot2:Bird3(){
    override var color: String = "Green"
    override fun fly() {
        println("Parrot can fly and color is $color")
    }
}
class Duck3:Bird3(){
    override var color:String="White"
    override fun fly() {
        println("Ducks can Fly and color is $color")
    }
}

open class Bird4{
    open var color:String="Black"
    open fun fly(){
        println("Birds can fly and color is $color")
    }
}
class Parrot3:Bird4(){
    override var color: String = "Green"
    override fun fly() {
        super.fly()
        println("Parrot can fly and color is $color")
    }
}
class Duck4:Bird4(){
    override var color:String="White"
    override fun fly() {
        super.fly()
        println("Ducks can Fly and color is $color")
    }
}
fun main(){
//    val ob1=Derived1()
//    ob1.print()
//
//
//    val b1=Duck()
//    b1.fly()
//    b1.swim()
//
//
////    val e1=Programmer("varun",25,95435.43f)
////    e1.doProgramming()
////
////    val e2=Salesman("Aditya",22,23434.34f)
////    e2.hobby()
//
//    val e1=Programmer1("Varun","Development", 9500000.0f )
//    e1.doProgramming()
//    val e2=Salesman1("Rohit","Marketing",35446f)
//    e2.hobby()

//    val e3=Child1("Ron",22,"rrrr")

//    val B1=Birds()
//    B1.fly()
//    val p1=Parrot()
//    p1.fly()
//    val d1=Duck1()
//    d1.fly()
//    val b1=Bird2()
//    b1.fly()
//    val p2=Parrot1()
//    p2.fly()
//    val d3=Duck2()
//    d3.fly()

//    val b1=Bird3()
//    b1.fly()
//    val p2=Parrot2()
//    p2.fly()
//    val d3=Duck3()
//    d3.fly()

    val b2= Bird4()
    b2.fly()
    val p3=Parrot3()
    p3.fly()
    val d4=Duck4()
    d4.fly()

}