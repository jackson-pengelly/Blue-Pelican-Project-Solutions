package com.jacksonpengelly.OverdrawnAtTheBank;

public class BankAccount {
    public double balance; // amount of money in the account
    public String name; // the name of the person who owns the account

    public BankAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    // a method called deposit which returns nothing and updates the balance
    public void deposit(double amount) {
        balance += amount; // += is equivalent to balance = balance + amount
    }

    // a method called withdraw which returns nothing and updates the balance
    public void withdraw(double amount) {
        balance -= amount; // -= is equivalent to balance = balance - amount
    }
}
