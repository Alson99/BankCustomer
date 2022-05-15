package com.company;

public class Customer {
    // Declaration of variables
    private String firstName;
    private String lastName;
    private Account account;

    // Declaration of the constructor

    Customer() {
    }

    Customer(String f , String l) {
        this.firstName = f;
        this.lastName = l;
    }
    // Declaration of setter and getter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Declaration of Account Method

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acc) {
        this.account = acc;
    }

    @Override
    public String toString() {
        return firstName + "," + lastName;
    }
}
