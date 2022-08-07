package by.part.bank.bean;

import java.io.Serializable;
import java.util.Objects;
//import java.util.Set;

public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 273724785577030195L;
	private static int counter = 1;

	private int ID;
	private String name;
	// private Set<Account> account;

	public Client() {
		this.ID = counter++;
	}

	public Client(String name) {
		this.ID = counter++;
		this.name = name;

	}

	public int getID() {
		return ID;
	}

	// public Set<Account> getAccount() {
	// return account;
	// }

	// public void addBalanceAccount(double money, int ID) {
	// for (Account ac : account) {
	// if (ac.getID() == ID) {
	// ac.setBalance(ac.getBalance() + money);
	// }
	// }
	// }

	// public void setAccount(Set<Account> account) {
	// this.account = account;
	// }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, name/* , account */);
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
		Client other = (Client) obj;
		return ID == other.ID && Objects.equals(name, other.name)/* && Objects.equals(account, other.account) */;
	}

	@Override
	public String toString() {
		return "Clien = [ID = " + ID + ", name = " + name /* + ", account = " + account */ + "]";
	}

}
