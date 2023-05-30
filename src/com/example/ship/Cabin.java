package com.example.ship;

public class Cabin {


    Passenger passenger1;

    public Cabin(Passenger passenger1) {
        this.passenger1 = passenger1;
    }
    public Passenger getPassenger1() {
        return passenger1;
    }

    public void Print(){
        System.out.println("Passenger Details");
        System.out.println("Name:    "+passenger1.getFirstName());
        System.out.println("Expanse: "+passenger1.getExpenses());
    }


}

