package edu.teamrocket.ricksybusiness;

public class CreditCard {

    private final String owner;
    private final String number;
    private double credit;
    private final String SYMBOL;

    public CreditCard(String owner, String number){
        this.owner = owner;
        this.number = number;
    }

    boolean pay(double charge){
        if(charge <= this.credit) {
            this.credit -= charge;
            return true;
        }else{
            return false;
        }
    }
}