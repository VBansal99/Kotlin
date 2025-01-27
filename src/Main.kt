fun variableFunc(){
    var userName:String="Varun"
    println("Hello $userName")
}
fun dataTypes(){

    //Int Data Type
    val maxIntegerValue:Int= Int.MAX_VALUE
    val minIntegerValue:Int=Int.MIN_VALUE

    println("The Maximum Value is:- $maxIntegerValue")
    println("The Minimum Value is:- $minIntegerValue")

    //Byte Data Type

    val maxByteValue:Byte= Byte.MAX_VALUE
    val minByteValue:Byte= Byte.MIN_VALUE

    println("Maximum Byte Value:- $maxByteValue")
    println("Minimum Byte Value:- $minByteValue")

    //Short Data Type

    val maxShortValue:Short= Short.MAX_VALUE
    val minShortValue:Short= Short.MIN_VALUE

    println("Maximum Short Value:- $maxShortValue")
    println("Minimum Short Value:- $minShortValue")


    //Long Data Type

    val maxLongValue:Long=Long.MAX_VALUE
    val minLongValue:Long=Long.MIN_VALUE

    println("Maximum Long Value:- $maxLongValue")
    println("Minimum Long Value:- $minLongValue")

    //Float Data type
    val floatNumber:Float=5f;
    val floatMaximumValue:Float= Float.MAX_VALUE
    val floatMinimumValue:Float= Float.MIN_VALUE
    println("Float Value is :- $floatNumber")
    println("Float maximum Value is:- $floatMaximumValue")
    println("Float minimum Value is:- $floatMinimumValue")


    // Double Data type
    val doubleNumber:Double=22.55
    val doubleMaximumValue:Double= Double.MAX_VALUE
    val doubleMinimumValue:Double= Double.MIN_VALUE
    println("Double Value is:- $doubleNumber")
    println("Double Maximum Value is:- $doubleMaximumValue")
    println("Double Minimum Value is:- $doubleMinimumValue")


    //Char Data Type
    val charValue:Char='d'
    val booleanValue:Boolean=false
    println("Boolean Value is:- $booleanValue")
    println("Char Value is:- $charValue")
}


fun main() {

    variableFunc()
    dataTypes()
   // whenExpression()
    println("Hemlo World!")
}