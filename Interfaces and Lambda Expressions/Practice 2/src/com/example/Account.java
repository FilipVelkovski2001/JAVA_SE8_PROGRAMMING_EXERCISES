package com.example;

public abstract class Account {
    
    protected double balance;
    
    public Account(double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return ": current balance is " + balance;
    }
    
    public abstract boolean withdraw(double amount);
}
    