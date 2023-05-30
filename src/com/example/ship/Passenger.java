package com.example.ship;

public class Passenger {
    private String FirstName;
    private String Surname;
    private String Expenses;

    public Passenger(String FirstName, String Surname, String Expenses) {
        this.FirstName = FirstName;
        this.Surname = Surname;
        this.Expenses = Expenses;
    }





    public String getFirstName() {
        return FirstName;
    }

    public String getSurname() {
        return Surname;
    }
    public String getExpenses() {
        return Expenses;
    }



}
