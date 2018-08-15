package com.suriya;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(double amt, String name) {
        if (findCustomer(name) == null) {
            customers.add(new Customer(amt, name));
            System.out.println("Added Successfully");
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double amt) {
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amt);
        }
        return false;
    }

    public Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            Customer checkCustomer = this.customers.get(i);
            if (checkCustomer.getName().equals(name)) {
                return checkCustomer;
            }
        }
        return null;
    }
}
