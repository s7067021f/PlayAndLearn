package com.mike;

public class MoneyRunner {
    
    public static void main(String[] args){
        Money balance = new Money(3.0);
        Money request = new Money(1.0);
        if (balance.isGreaterThan(request)){
            System.out.println("Can withdraw "+request.getValue());
            balance.withdraw(request);
            System.out.println("Balance is now " + balance.getValue());
        } else {
            System.out.println("Insufficient balance to withdraw "+request.getValue());
        }
    }
}
