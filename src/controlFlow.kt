fun whenExpression(){
    var number=4
    var result=when(number){
        1->"One"
        2->"Two"
        3->"Three"
        4->"Four"
        5->"Five"
        else -> {
        "Invalid number"
        }
    }
    println(result)
}
fun whenWithoutExpression(){
    var number=2
    when(number){
        1-> println("One")
        2-> println("Two")
        3-> println("Three")
        4-> println("Four")
        5-> println("Five")
        else ->{
            println("Invalid Number")
        }
    }
}

fun multipleStatements(){
    val number=6
    when(number){
        1->{
            println("Executed 1")
            println("It's number 1")
        }2->{
            println("Executed 2")
            println("It's number 2")
        }6->{
            println("Executed 6")
            println("It's number 6")
        }3->{
            println("Executed 3")
            println("It's number 3")
        }
        else ->{
            println("Invalid Number")
        }
    }
}

fun multipleWhenBranches(){
    val number=6
    when(number){
        1,2,3,4->{
            println("The number is from 1 to 4")
        }
        5,6,7,8->{
            println("The number is from 5 to 8")
        }
        9,10,11,12->{
            println("The number is from 9 to 12 range")
        }
        else -> println("Invalid")
    }
}

fun whenInRange(){
    val number=4
    when(number){
        in 1..5->{
            println("The Number is in the range of 1 to 5")
        }
        in 5..10->{
            println("The Number is in the range of 6 to 10")
        }else ->{
            println("The Number is out of Range")
        }
    }
}

fun forLoop(){
    val marks= arrayOf(10,20,30,40,50)
    for(item in marks){
        println(item)
    }
    for(item1 in marks.indices){
        println("marks[$item1]:"+marks[item1])
    }

    println("For i in 1 to 5")
    for (i in 1..5){
        print(i)
    }
    println()
    println("For in 5 to 1")
    for(i in 5..1 ){
        print(i)
    }
    println()
    println("For i in 5 down to 1")
    for(i in 5 downTo 1){
        print(i)
    }
    println()
    println("For i in 5 down to 2")
    for(i in 5 downTo 2)
        print(i)
    println()
    println("For i in 1 to 5 step 3")
    for(i in 1..5 step 3)
        print(i)
    println()
    println("For i in range 5 to 1 step 2")
    for(i in 5..1 step 2)
        print(i)
    println()
}

fun whileLoop(){
    var i=0
    while (i<=5){
        println(i)
        i++
    }
    while (true){
        println("Infinite ")
    }
}

fun doWhileLoop(){
    var i=1
    do{
        print(i)
        i++
    }while (i<=5)
}

fun breakStatement(){
    for (i in 1..10){
        if(i==5)
            break;
    }

    loop@ for(i in 1..5){
        for(j in 1..5){
            println("i is $i and j is $j")
            if (i==3)
                break@loop
        }
    }
}

fun continueStatement(){
    
}
fun main(){
    //whenExpression()
    //whenWithoutExpression()
    //multipleStatements()
    //multipleWhenBranches()
    //whenInRange()
    //forLoop()
    //whileLoop()
    //doWhileLoop()
    //breakStatement()
    continueStatement()
}