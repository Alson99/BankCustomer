package com.company;

public class Account {
    private double balance; // The instance of variable of the Balance

    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            balance = initialBalance;
        } else if(initialBalance == 0.0){
            balance = 0.0;
        }
    }
    public double dept(double dept1) {
        dept1 = balance - dept1;
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
