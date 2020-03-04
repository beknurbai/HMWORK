package com.company;

public class LimitException extends Exception {
    private double ramainingAmount;



    public  LimitException (String massage, double amount){
        super(massage);
        this.ramainingAmount =amount;


    }public double getRamainingAmount() {
        return ramainingAmount;}
}
