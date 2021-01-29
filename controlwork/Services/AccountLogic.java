package it.by.cw.savkin.Services;

import java.util.ArrayList;

import it.by.cw.savkin.bean.BankAccount;

public class AccountLogic {
	
	public ArrayList<BankAccount> searchPositiveAccount(ArrayList<BankAccount> positiveAccounts ){
		
		ArrayList<BankAccount> positiveAc = new ArrayList<>(); 
		
		for (BankAccount  currentBankAccount : positiveAccounts) {
			if (currentBankAccount.getCash() > 0) {
				positiveAc.add(currentBankAccount);
				
			}
		}
		
		return positiveAc;
	}

   public ArrayList<BankAccount> searchNegativeAccount(ArrayList<BankAccount> negativeAccounts ){
		
		ArrayList<BankAccount> negativeAc = new ArrayList<>(); 
		
		for (BankAccount  currentBankAccount : negativeAccounts) {
			if (currentBankAccount.getCash() < 0) {
				negativeAc.add(currentBankAccount);
				
			}
		}
		
		return negativeAc;
	}
	
   public ArrayList<BankAccount> searchZerroAccount(ArrayList<BankAccount> ZerroAccounts ){
		
		ArrayList<BankAccount> ZerroAc = new ArrayList<>(); 
		
		for (BankAccount  currentBankAccount : ZerroAccounts) {
			if (currentBankAccount.getCash() == 0) {
				ZerroAc.add(currentBankAccount);
				
			}
		}
		
		return ZerroAc;
	}
   
   public ArrayList<BankAccount> searchIdAccount(ArrayList<BankAccount> Accounts, int id ){
		
		ArrayList<BankAccount> Ac = new ArrayList<>(); 
		int i = id;
		for (BankAccount  currentBankAccount : Accounts) {
			if (currentBankAccount.getId() == i) {
				Ac.add(currentBankAccount);
				
			}
		}
		
		return Ac;
	}
   
   public ArrayList<BankAccount> searchBlockedAccount(ArrayList<BankAccount> Accounts, boolean f ){
		
		ArrayList<BankAccount> Ac = new ArrayList<>(); 
		for (BankAccount  currentBankAccount : Accounts) {
			if (currentBankAccount.isBlocked() == f) {
				Ac.add(currentBankAccount);
				
			}
		}
		
		return Ac;
	}
   
   public int searchSumPositiveAccount(ArrayList<BankAccount> Accounts){
		
		int sum = 0; 
		
		for (BankAccount  currentBankAccount : Accounts) {
			if (currentBankAccount.getCash() > 0) {
				sum = sum + currentBankAccount.getCash();
				
			}
		}
		
		return sum;
	}
   
   public int searchSumNegativeAccount(ArrayList<BankAccount> Accounts){
		
		int sum = 0; 
		
		for (BankAccount  currentBankAccount : Accounts) {
			if (currentBankAccount.getCash() < 0) {
				sum = sum - currentBankAccount.getCash();
				
			}
		}
		
		return sum;
	}
   
   public int searchSumAccount(ArrayList<BankAccount> Accounts){
		
		int sum = 0; 
		
		for (BankAccount  currentBankAccount : Accounts) {
			
				sum = sum + currentBankAccount.getCash();
				
			
		}
		
		return sum;
	}
	
}
