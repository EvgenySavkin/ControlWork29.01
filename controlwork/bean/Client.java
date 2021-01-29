package it.by.cw.savkin.bean;

import java.util.ArrayList;

public class Client implements Serializable {
	
	
	private ArrayList<BankAccount> bankAccounts; 
	
	public Client() {
		bankAccounts = new ArrayList<>();
		
	}

	public ArrayList<BankAccount> getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankAccounts == null) ? 0 : bankAccounts.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (bankAccounts == null) {
			if (other.bankAccounts != null)
				return false;
		} else if (!bankAccounts.equals(other.bankAccounts))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [bankAccounts=" + bankAccounts + "]";
	}
	
	public void add(BankAccount bankAccount) {
		bankAccounts.add(bankAccount);
	}
	
	public void remove(BankAccount bankAccount) {
		bankAccounts.remove(bankAccount);
		
	}
	
	

}
