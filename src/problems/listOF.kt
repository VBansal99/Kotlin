package problems

fun main() {
    var list = listOf("Ajay", "Vijay", "Parkash", 0, 1, 2, 3)

    var listOfString = listOf<String>("Ajay", "Vijay", "Vivek")
    var listOfInt = listOf<Int>(1, 2, 3, 4, 5)
    var listOfAny = listOf<Any>(1, 2, 3, 4, 1.1, "Ram")


    var listOfString1 = listOf<String>("Ajay", "Vijay", "Sharma", "Verma")

    for (element in list)
        print("$element ")
    println()
    // To get the index values
    for (element in 0..list.size - 1)
        print(list[element])

    println()
    for (element in listOfString)
        print("$element ")
    println()
    for (element in listOfInt)
        print("$element ")
    println()
    for (element in listOfAny)
        print("$element ")
    println()

    //Operations on List of
    println(listOfString1.get(1))
    println(listOfString1.indexOf("Ajay"))
    println(listOfString1.size)
    println(listOfString1.contains("Sharma"))
    println(listOfString1.containsAll(listOfString))
    println(listOfString1.subList(0, 3))
    println(listOfString1.isEmpty())
    println(listOfString1.drop(1))
    println(listOfString1.dropLast(1))
    println(listOfString1.last())
}