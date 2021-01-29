package it.by.cw.savkin.bean;
import java.io.Serializable;

public class BankAccount implements Serializable {
		


	private static final long serialVersionUID = 6191820040920655720L;
	
	private int id;
	private boolean blocked;
	private int cash;
	
	
	public BankAccount() {}
	
	public BankAccount(int id, boolean blocked, int cash) {
		this.id = id;
		this.blocked = blocked;
		this.cash = cash;
				
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public boolean isBlocked() {
		return blocked;
	}


	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}


	public int getCash() {
		return cash;
	}


	public void setCash(int cash) {
		this.cash = cash;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (blocked ? 1231 : 1237);
		result = prime * result + cash;
		result = prime * result + id;
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
		BankAccount other = (BankAccount) obj;
		if (blocked != other.blocked)
			return false;
		if (cash != other.cash)
			return false;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", blocked=" + blocked + ", cash=" + cash + "]";
	}


}
	