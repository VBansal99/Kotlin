fun tryCatchImpl(){
    try{
        val data=20/0
    }catch (e:ArithmeticException) {
        println(e)
    }
    println("This is the code")
}
fun getNumber(str:String):Int{
    return try {
        Integer.parseInt(str)
    }catch (e:ArithmeticException){
        0
    }
}

fun tryCatchImpl2(){
    val num=getNumber("10")
    println(num)
}

fun getNumber2(str: String):Int{
    return try{
        Integer.parseInt(str)
    }catch (e:Exception){
        0
    }
}

fun tryCatchImpl3(){
    val num =getNumber2("10.3")
    println(num)
}

fun multipleCatchExceptions(){
    try {
        val a = IntArray(5) { 0 }
        a[4] /= 0
        a[5]/=0
    }catch (e:Exception){
        println("Parent class exception")
    }catch (e:ArithmeticException){
        println("This is an arithmetic exception")
    }catch (e:ArrayIndexOutOfBoundsException){
        println("Array Index out of Bounds")
    }
    println("This will run after")
}

fun multipleTryCatch(){
    val arr1= intArrayOf(10,20,30,40,50,60)
    val arr2= intArrayOf(0,1,2,3,4)

    try {
        for(index in arr1.indices)
            try {
                println(arr1[index].toString() +"is divided with"+arr2[index] + " "+ arr1[index]/arr2[index])
            }catch (e:ArithmeticException){
                println("Number can't Divided")
            }
    }catch (e:ArrayIndexOutOfBoundsException) {
        println("Element Not Found")
    }
}
fun main(){
   // tryCatchImpl()
   // tryCatchImpl2()
   // tryCatchImpl3()
   // multipleCatchExceptions()
    multipleTryCatch()
}