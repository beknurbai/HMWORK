package com.company;

public class Main {

    public static void main(String[] args) {
BankAccount bankAccount=new BankAccount();
bankAccount.deposit(10000);
        System.out.println(bankAccount.getAmount());
        for (int i = 0;  ; i++) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                e.printStackTrace();
            }
            break;


        }
    }
}
