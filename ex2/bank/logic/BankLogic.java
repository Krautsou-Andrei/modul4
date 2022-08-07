package by.part.bank.logic;

import java.util.Set;

import by.part.bank.bean.Account;
import by.part.bank.bean.Client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankLogic {

	private double balanceAccount;// Красиво и более читаемо (для меня), если передать в класс BankLogic сам банк
									// и работать в этом классе с банком, выдавая клиенту нужную информацию.
									// (getBalanceAllAccount, getSortAccountByBalance, getSearchClient) и т.д. Но
									// если будут другие банки, тогда придется создавать для них новый объект
									// BankLogic

	public BankLogic() {

	}

	public List<Account> sortAccountByBalance(Map<Client, Set<Account>> listAccount) {

		List<Account> sortAccountByBalance = listAccountAll(listAccount.values());

		sortAccountByBalance.sort(Comparator.comparing(Account::getBalance));

		return sortAccountByBalance;
	}

	public Map<Client, Account> searchClientByAccount(Map<Client, Set<Account>> listAccount, int ID) {

		Set<Client> listClient = listAccount.keySet();// Записываем в коллекцию значения ключей
		Map<Client, Account> searchClient = new HashMap<>();// создаем Map, который будем возвращать, если не найдем
															// номер счета

		for (Client client : listClient) {

			Set<Account> clientListAccount = listAccount.get(client);// У каждого клиента несколько счетов(коллекция в
																		// коллекции), здесь записываем в коллекцию
																		// счета конкретного клиента

			for (Account account : clientListAccount) {// Сравниваем номер счета с номерами счетов клиента, если
														// совпадают - записываем в Map. Поскольку счета не могут иметь
														// одинаковые номера - заканчиваем сравнение и возвращаем Map
				if (account.getID() == ID) {
					searchClient.put(client, account);
					return searchClient;

				}
			}
		}

		return searchClient;// Если нет совпадений - возвращаем пустую Map
	}

	public double balanceAccountPositive(Collection<Set<Account>> listAccount) {

		List<Account> listAccountAll = listAccountAll(listAccount);

		this.balanceAccount = 0;

		listAccountAll.forEach(account -> {
			if (account.getBalance() > 0) {
				this.balanceAccount += account.getBalance();
			}
		});

		return balanceAccount;
	}

	public double balanceAccountNegative(Collection<Set<Account>> listAccount) {

		List<Account> listAccountAll = listAccountAll(listAccount);

		this.balanceAccount = 0;

		listAccountAll.forEach(account -> {
			if (account.getBalance() < 0) {
				this.balanceAccount += account.getBalance();
			}
		});

		return balanceAccount;
	}

	public double balanceAccountAll(Collection<Set<Account>> listAccount) {
		return balanceAccountPositive(listAccount) + balanceAccountNegative(listAccount);
	}

	private List<Account> listAccountAll(Collection<Set<Account>> listAccount) {

		List<Account> listAccountAll = new ArrayList<>();// Из коллекции коллекций делаем коллекцию счетов

		for (Set<Account> account : listAccount) {
			listAccountAll.addAll(account);
		}

		return listAccountAll;
	}
}
