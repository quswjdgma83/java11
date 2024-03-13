package bankapp;

import bank.Account;

public class BankApp {
    public static void main(String[] args) {
        Account acc1 = new Account("1112","James", -1000L,2.3);
        System.out.println(acc1);
        acc1.deposit(-1000L);
        System.out.println(acc1);
        acc1.withdraw(100000000L);
    }
}
