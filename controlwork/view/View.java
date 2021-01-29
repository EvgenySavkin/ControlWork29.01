package it.by.cw.savkin.view;

import java.util.ArrayList;

import it.by.cw.savkin.bean.BankAccount;

public class View {

	public void printAccount(ArrayList<BankAccount> accounts) {
		System.out.println(" ------------- ");
		for(BankAccount bankAccount : accounts) {
			System.out.print(" ID " + " " + bankAccount.getId() + " " + bankAccount.getCash());
		}
		
	}
}
