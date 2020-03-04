package com.company;

import java.util.Scanner;

public class BankAccount {
    public static double amount ;

    public static void main(String[] args){}
    public  void deposit(double sum) {
       // for (int i = 1; ; i++) {
          //  System.out.println("вставьте сумму: ");
         //   Scanner sc = new Scanner(System.in);
           // double sum = sc.nextDouble();
            System.out.println(amount + sum);
            return;
        }


    public  double withDraw(int money) throws LimitException {
            if (amount < money) {
                throw new LimitException("НЕ ДОСТАТОЧНО СРЕДСТВ НА ВАШЕМ БАЛАНСЕ :", amount);

            }
            amount = amount;
            return amount;
        }

        public double getAmount () {
            return amount;
        }
    }

