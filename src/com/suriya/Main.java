package com.suriya;

public class Main {

    public static void main(String[] args) {
	Bank bank = new Bank("com.suriya.Bank Of America");
	bank.addbranch("Brannan");
	bank.addCustomer("Brannan", "Suri", 1508.25);
	bank.addCustomer("Brannan", "Jess", 1500.25);
	bank.addCustomer("Brannan", "George", 1263.25);

	bank.addbranch("Mission");
	bank.addCustomer("Mission", "Mohu", 4500.25);
	bank.addCustomerTransaction("Brannan", "Suri", 452.23);
    bank.listCustomers("Brannan", true);
    bank.listCustomers("Mission", true);

	}
}

