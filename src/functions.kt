fun sum(val1: Int,val2: Int):Int{
    val result=val1+val2
    return result
}

fun namedArguments(a:Int =5 ,char :Char= 'g'){
    println("The value of a is $a and char is $char")
}
fun namedArguments2(a:Int =2, char :Char='c'){
    println("The value of a is $a and char is $char")
}
fun namedArguments3(a:Int =0, char: Char='j'){
    println("The value of a is $a and char is $char")
}
fun namedArguments4(a:Int =1, char: Char='z'){
    println("The value of a is $a and char is $char")
}
fun main(){
    var a=6
    var b=7
   // val result=sum(a,b)
 //   println(result)
    namedArguments()
    namedArguments2(6)
    namedArguments3(3,'v')
    namedArguments4(char = 'v')
}