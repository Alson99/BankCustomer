package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> Customers;
    private int numberCustomers;

    public Bank(){
        Customers = new ArrayList<Customer>();
    }
    public void addCustomer( String f, String l){
        Customer p = new Customer(f,l);
        Customers.add(p);
    }
    public int getNumberCustomers(){
        numberCustomers = Customers.size();
        return numberCustomers;
    }
    public Customer getCustomer(int index){
        return Customers.get(index);
    }
}
