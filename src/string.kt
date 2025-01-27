fun stringImplementation(){
    val str1="Hello Kotlin"
    val str2="""This is a Raw string"""
    println(str1)
    println(str2)

    println(str1.length)
    println(str2.length)

    println("${str1.indices },${str2.indices}" )

    for(i in str1)
        print(i)
    println()
    println(str1.lastIndex)
    println(str2.lastIndex)
}

fun stringFunctions(){
    val str1 = "Hello"
    val str2 = "Kotlin"
    val str3 = "Varun"

    println(str1.compareTo(str2))
    println(str1.get(0))
    println(str1.plus(str3))
    println(str1.subSequence(0,3))
    println()

}
fun main(){
    //stringImplementation()
    stringFunctions()
}