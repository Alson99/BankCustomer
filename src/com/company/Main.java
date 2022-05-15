package com.company;

public class Main {

    public static void main(String[] args) {
        Bank cus = new Bank();
        cus.addCustomer("Brunel", "Anga");
        cus.addCustomer("Godson", "Essonga");
        cus.addCustomer("Gloire", "Mfouna");
        cus.addCustomer("Fils", "Alouna");

        for (int i = 0; i < cus.getNumberCustomers(); i++) {
            System.out.println("Customer" + (i + 1) + " is " + " " + cus.getCustomer(i));
        }
        System.out.println(" Current customer quantity = " + cus.getNumberCustomers());
        System.out.println(" The second customer is: " + cus.getCustomer(2));
    }
}
