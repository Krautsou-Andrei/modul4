package by.part.bank.main;

import java.util.List;
import java.util.Map;
import java.util.Set;

import by.part.bank.bean.Account;
import by.part.bank.bean.Client;

public class Print {

	public Print() {

	}

	public void account(Account account) {

		System.out.printf("Account namber %d, balance = %.2f", account.getID(), account.getBalance());
		if (account.isBlocked() == true) {
			System.out.println(" account is blocked");
		} else {
			System.out.println(" account is not blocked");
		}
	}

	public void client(Client client) {

		System.out.printf("Client name %s \n", client.getName());
	}

	public void bank(Map<Client, Set<Account>> listAccount) {

		for (Map.Entry<Client, Set<Account>> client : listAccount.entrySet()) {
			client(client.getKey());
			client.getValue().forEach(account -> account(account));
			System.out.println("-----------------------------------------------------");
		}

	}

	public void balance(double balance, String str) {

		System.out.printf("%s %.2f \n", str, balance);
		System.out.println("-----------------------------------------------------");
	}

	public void sortAccount(List<Account> listAccount) {

		System.out.println("Sort account by balance");
		listAccount.forEach(account -> account(account));
		System.out.println("-----------------------------------------------------");
	}

	public void searchClientByAccount(Map<Client, Account> searchClient) {

		if (searchClient.keySet().size() != 0) {
			System.out.println("Search client");
			searchClient.keySet().forEach(client -> client(client));
			searchClient.values().forEach(account -> account(account));
			System.out.println("-----------------------------------------------------");
		} else {
			System.out.println("Client not found");
			System.out.println("-----------------------------------------------------");
		}
	}
}
