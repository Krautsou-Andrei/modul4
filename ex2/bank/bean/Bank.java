package by.part.bank.bean;

import java.io.Serializable;
import java.util.HashMap;
//import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Bank implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4461965679835235613L;

	private String name;
	private Map<Client, Set<Account>> listClient = new HashMap<>();// Выбрал Map, потому, что счета принадлежат банку, а
																	// клиент открывая счет в банке приобретает
																	// право на индивидуальное использование открытого
																	// счета. Можно у клиента создать поле счет,
																	// которому будет присваиваться ссылка на его счет,
																	// через ключ в Map

	public Bank() {

	}

	public Bank(String name, Map<Client, Set<Account>> listClient) {
		this.name = name;
		this.listClient = listClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Client, Set<Account>> getListClient() {
		return listClient;
	}

	public void setListClient(Map<Client, Set<Account>> listClient) {
		this.listClient = listClient;
	}

	public void addClient(Client client, Set<Account> account) {
		this.listClient.put(client, account);
	}

	//public void addClient(Client client, double money) {
	//	Set<Account> newAccount = new HashSet<>();
	//	newAccount.add(new Account(money, true));
	//	this.listClient.put(client, newAccount);
	//	client.setAccount(this.getListClient().get(client));
	//}

	@Override
	public int hashCode() {
		return Objects.hash(listClient, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		return Objects.equals(listClient, other.listClient) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Bank [name = " + name + ", listClient = " + listClient + "]";
	}

}
