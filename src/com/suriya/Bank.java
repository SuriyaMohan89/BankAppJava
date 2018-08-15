package com.suriya;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }
    public boolean addbranch(String branchName){
        if (findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String name, double amt){
        Branch branch = findBranch(branchName);
        if(branch != null) {
            branch.addNewCustomer(amt,name);
            System.out.println("SUCCESSFUL TRANSACTION");
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchname, String customerName, double amt){
        Branch branch = findBranch(branchname);
        if (branch != null){
            branch.addCustomerTransaction(customerName,amt);
            return true;
        }
        return false;
    }

    public Branch findBranch(String branchName){
        for (int i = 0; i<this.branches.size(); i++){
            if (this.branches.get(i).getBranchName().equals(branchName)){
                return this.branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch customerBranch = findBranch(branchName);
        if (findBranch(branchName) != null){
            ArrayList<Customer> branchCustomerList = customerBranch.getCustomers();
            for (int i =0; i < branchCustomerList.size(); i++){
                Customer customerDetail = branchCustomerList.get(i);
                System.out.println("com.suriya.Customer: "+ customerDetail.getName());
                if (showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customerDetail.getTransaction();
                    for(int j = 0; j < transactions.size(); j++){
                        System.out.println("Transactions "+  transactions.get(j));
                    }
                }

            }
            return true;
        } else {
            return false;
        }
    }


}
