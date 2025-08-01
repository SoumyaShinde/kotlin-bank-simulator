enum class BankingType{
    CREDIT, DEBIT, CHECKING
}

fun main(){
    println("Banking system")
    val accountType : BankingType = createAccountType()
    println()
    var accountBalance :Long = -50

    fun depositAmount(money: Long):Long{
        val amount: Long = money
        accountBalance += amount
        return accountBalance
    }

    fun withdraw(amount:Long){
        val money = amount
        if(money > accountBalance){
            println("Not enough money on this account!")
        }else{
            accountBalance -=money
            println("The amount you withdrawn is ${money} dollars.")
        }

    }

    fun debitWithdraw(money:Long) {
        if(accountBalance  == 0L){
            println("Can't withdraw, no money on this account!")
        }else{
            withdraw(money)
        }
    }

    fun modeWithdraw(account: BankingType) {
        val money = promptToAskMoney()
        if (accountType == BankingType.DEBIT){
             debitWithdraw(money)
        }else{
             withdraw(money)
        }
    }
    fun creditDeposit(money:Long){
        if(accountBalance == 0L){
            println("You don't need to deposit anything in order to payoff this account, it has already been paid off.\nThe balance is $accountBalance dollars")
            accountBalance = 0L
        } else if (accountBalance + money > 0){
            println("Deposit failed, you tried to pay off an amount greater than the credit balance. The checking balance is ${accountBalance} dollars.")

        }else if(money == -accountBalance){
            println("You have paid off this account!")
            accountBalance=0
        }else{
            depositAmount(money)
        }
    }

    fun modeDeposit(accountType: BankingType) {
        val money = promptToAskMoney()
        if (accountType == BankingType.CREDIT){
            creditDeposit(money)
        } else{
            depositAmount(money)
        }
    }

    var systemOpen = true
    var option = 0

    while (systemOpen) {
        println()
        println("What would you like to do?")
        println("1. Check bank account balance")
        println("2. Withdraw money")
        println("3. Deposit money")
        println("4. Close the system")
        println("Which option do you choose? (1, 2, 3 or 4)")
        option = readln().toInt()
        var transferAmount : Long = 0
        when(option){
            1->println("The current balance is $accountBalance dollars.")
            2->{
                modeWithdraw(accountType)
                println("The current balance is $accountBalance dollars")
            }
            3-> {
                modeDeposit(accountType)
                println("The balance now is ${accountBalance} dollars")

            }
            4->{
                systemOpen = false
                println("System is closed")
            }
            else -> continue
        }
    }
}

fun promptToAskMoney():Long{
    println("Enter the amount :")
    var money : Long = 0L
    while(money <= 0L){
        money = readln().toLong()
        if (money <= 0L){
            println("The deposit amount should be positive, please enter the correct amount again")
        }
    }
    return money
}

fun createAccountType() : BankingType{
    println("Enter the typeof account\n1.Credit\n2.Debit\n3.Checking")
    var account :BankingType?=null
    while(account == null){
        var accountInput = readln()
        account = when(accountInput){
            "1"->BankingType.CREDIT
            "2"->BankingType.DEBIT
            "3"->BankingType.CHECKING
            else->null
        }
    }
    println("You have $account account")
    return account
}
