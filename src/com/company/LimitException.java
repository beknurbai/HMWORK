package com.company;

public class LimitException extends Exception {
    private double amount;



    public  LimitException (String massage, double amount){
        super(massage);
        this.amount=amount;


    }public double getAmount() {
        return amount;}
}
