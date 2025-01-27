import java.util.Scanner

class Account{
    //Properties
    var accNo:Int=0
    var name:String?=null
    var amount:Float=0F

    //Member Functions
    fun insert(account: Int, name:String, amt:Float){
    accNo=account
    this.name=name
    amount=amt
        println("Account No:-${account}")
        println("Name of the User:-${name}")
        println("Amount:-${amt}")
    }
    fun deposit(){
        val scanner = Scanner(System.`in`)
        println("Enter the amount you want to deposit:-")
        var newAmount1:Float=scanner.nextFloat()
        amount+=newAmount1
    }
    fun withdraw(){
        val scanner=Scanner(System.`in`)
        println("Enter the amount you want to withdraw:-")
        var withDraw1:Float=scanner.nextFloat()
        amount-=withDraw1
        checkBankBalance()
    }
    fun checkBankBalance(){
        println("The Bank Balance is:- ${amount}")
    }

}

fun main(){
    // Object creation
    var varunAcc=Account()
    varunAcc.insert(24223432,"Varun Bansal", 2000000.0f)
    println(varunAcc.name)
    varunAcc.deposit()
    varunAcc.checkBankBalance()
    varunAcc.withdraw()

}