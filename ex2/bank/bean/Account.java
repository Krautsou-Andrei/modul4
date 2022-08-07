package by.part.bank.bean;

import java.io.Serializable;
import java.util.Objects;



public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1128705350465654929L;
	private static int counter = 1;

	private int ID;
	private double balance;
	private boolean blocked;

	public Account() {
		this.ID = counter++;
	}

	public Account(double balance, boolean blocked) {
		this.ID = counter++;
		this.balance = balance;
		this.blocked = blocked;
	}

	public int getID() {
		return ID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
		setBlocked(this.balance < 0 ? true: false); //если баланс становится отрицательным - блокируем счет 
			
		
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {//блокировка и разблокировка счета вручную
		this.blocked = blocked;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, balance, blocked);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Account other = (Account) obj;
		return ID == other.ID && balance == other.balance && blocked == other.blocked;
	}

	@Override
	public String toString() {
		return "Account = [ID = " + ID + ", balance = " + balance + ", blocked = " + blocked + "]";
	}

}
