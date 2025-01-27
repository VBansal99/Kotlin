package OOPS

class person{
    //Empty class
    // Compiler Generate constructor automatically
}
class School constructor(){
 // manually initialized a constructor
}

class Account{
    var accNo:Int?=0
    var name:String?=null
    var amount:Float=0f

    fun insert(accountNo:Int, userName:String,amt:Float){
        accNo=accountNo
        name=userName
        amount=amt
        println("Account No is:-$accountNo UserName is:- $userName Amount is:- $amount ")
    }

    fun deposit(){
        println("Deposit Function")
    }
    fun withDraw(){
        println("WithDraw Function")
    }
    fun checkBankBalance(){
        println("Check Bank Balance Function")
    }
}
fun main(){
    //Object creation
    var acc1=Account()
    acc1.insert(53454535,"Ram",345345.5f)
    acc1.insert(5353453,"Sham",342342.34f)
    acc1.deposit()
    acc1.withDraw()
    acc1.checkBankBalance()
}