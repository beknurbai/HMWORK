package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit();

        for (int i = 0; ; i++) {

            bankAccount.withDraw();

        }
    }
}
