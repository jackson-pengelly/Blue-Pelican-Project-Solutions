package com.jacksonpengelly.OverdrawnAtTheBank;

public class Main {
    public static void main(String[] args) {
        // instantiate a new BankAccount object with a balance of 1000 and the name "Sally Jones"
        BankAccount myAccount = new BankAccount(1000, "Sally Jones");

        // call the deposit method
        myAccount.deposit(505.22);

        // print the balance
        System.out.println(myAccount.balance);

        // call the withdraw method
        myAccount.withdraw(100);

        // print the remaining balance
        System.out.println("The " + myAccount.name + " account balance is, $" + myAccount.balance);
    }
}
