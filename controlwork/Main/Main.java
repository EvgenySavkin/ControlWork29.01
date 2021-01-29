package it.by.cw.savkin.Main;

import it.by.cw.savkin.bean.BankAccount;
import it.by.cw.savkin.bean.Client;
import it.by.cw.savkin.view.View;

import java.util.ArrayList;

import it.by.cw.savkin.Services.AccountLogic;

public class Main {

	public static void main(String[] args) {
		
		BankAccount a1 = new BankAccount(15,true,25000);
		BankAccount a2 = new BankAccount(16,true,17000);
		BankAccount a3 = new BankAccount(17,true,0);
		BankAccount a4 = new BankAccount(18,true,-250);
		BankAccount a5 = new BankAccount(19,false,-11000);
		BankAccount a6 = new BankAccount(20,true,2000);
		BankAccount a7 = new BankAccount(21,false,0);
		BankAccount a8 = new BankAccount(22,true,500);
		
		Client Vasya = new Client();
		AccountLogic accountLogic = new AccountLogic();
		View view = new View();
		
		Vasya.add(a1);
		Vasya.add(a2);
		Vasya.add(a3);
		Vasya.add(a4);
		Vasya.add(a5);
		Vasya.add(a6);
		Vasya.add(a7);
		Vasya.add(a8);
		
		
		
		ArrayList<BankAccount> bankAccounts;
		
		bankAccounts = accountLogic.searchPositiveAccount(Vasya.getBankAccounts());
		
		view.printAccount(bankAccounts);
        
	}

}
