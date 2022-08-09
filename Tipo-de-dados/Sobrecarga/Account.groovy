class Account2 {

    BigDecimal balance

    Account2 plus(Account2 other ){
        new Account2(balance: this.balance + other.balance)
    }

    String toString(){
        "Account Balance: $balance"
    }
}

Account2 savings = new Account2(balance: 100.00)
Account2 checking = new Account2(balance:500.00)

println savings + checking
