fun arrayDeclaration(){
    // Declaration
    var myArray1= arrayOf(10,20,30,40,50)
    var myArray2= arrayOf<Int>(10,20,30,40,50)
    var myArray3= arrayOf<String>("Ram","Sham","Verma", "Dharma")
    var myArray4= arrayOf(10,20,30,40,"Ram","Sham","Verma","Dharma")


    var myArrayNew= intArrayOf(10,2030,40,50)
}

fun arrayOfMethods(){
    var array= arrayOf(10,20,30,40,50)
    var array1= arrayOf<Long>(234234324,335,34,54,5,34,543,5,43)
    var array2= arrayOf(1,2,3,4,5,"Ram","Sham","Sita","Geeta")

    array.set(0,55)
    array[1]=66
    array1.set(4,999999999999999999)
    array2[7]="Bansal"

    for(item in array)
        print(" $item")
    println()
    for (item1 in array1)
        print(" $item1")
    println()
    for(item2 in array2)
        print(" $item2")
    println()
    println("Array value ${array.get(0)},${array.get(1)}" )
    println("Array1 value ${array1.get(0)},${array1.get(5)}")
    println("Array2 value ${array2.get(4)},${array2.get(3)}")
}

fun arrayImplementation(){
    var array=Array<Int>(5){1}

    for(item in array)
        print(" $item")

    println()
    array[0]=50
    array[1]=10
    array[2]=20
    array[3]=30
    array[4]=40


    var i=1;
    do {
        print(" $i")
        i++
    }while (i<=array.size)
}

fun arrayImplementationUsingRange(){
    var array =Array(5){7}

    for(index in 0..3){
        print(array[index])
    }
    println()

    for(index in 0..array.size-1){
        print(array[index])
    }
println()
    for (index in array.size-1 downTo 0)
    print(array[index])

}

fun main(){
    //arrayDeclaration()
    //arrayOfMethods()
    //arrayImplementation()
    arrayImplementationUsingRange()
}