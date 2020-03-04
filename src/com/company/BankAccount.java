package com.company;

import java.util.Scanner;

public class BankAccount {
    public static double amount ;



    public double deposit() {

            System.out.println("вставьте сумму: ");
            Scanner sc = new Scanner(System.in);
            double sum = sc.nextDouble();

            System.out.println("вы пополнили счет на: " + sum);
            return amount= amount+sum ;
        }


    public double withDraw() {


            System.out.println("укажите сумму: ");
            Scanner sc = new Scanner(System.in);
            double money = sc.nextDouble();
            System.out.println("вы сняли :" + amount);
            if (amount > 0) {
                amount = getAmount() - money;

                if (amount < 0){
                    amount = amount-amount;
                }



                System.out.println("остаток: " + amount);
            }

    if (amount < money) {
                try {
                    throw new LimitException("НЕ ДОСТАТОЧНО СРЕДСТВ НА ВАШЕМ БАЛАНСЕ :", amount);

                } catch (LimitException e) {

                    e.printStackTrace();
                    System.out.println();
                }
            }

            return amount;
        }


    public static double getAmount() {
        return amount;
    }
}

