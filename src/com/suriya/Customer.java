package com.suriya;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transactions = new ArrayList<Double>();
    private String name;

    public Customer(double initialAmt, String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmt);
    }
    public ArrayList<Double> getTransaction() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amt) {
        this.transactions.add(amt);
        System.out.println("Successfully deposited");
    }
}
