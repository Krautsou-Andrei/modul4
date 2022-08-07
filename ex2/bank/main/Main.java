package by.part.bank.main;

//Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//Реализовать поиск и сортировку счетов. ВЫчисление общей суммы по счетам. Вычисление суммы по всем счетам,
//имеющим положительный и отрицательный балансы отдельно.

//import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
//import java.util.List;
import java.util.Map;
import java.util.Set;

import by.part.bank.bean.Account;
import by.part.bank.bean.Bank;
import by.part.bank.bean.Client;
import by.part.bank.logic.BankLogic;

public class Main {
	public static void main(String[] args) {

		Account account1 = new Account(225, false);
		Account account2 = new Account(3000, false);
		Account account3 = new Account(-20, true);
		Account account4 = new Account(100, false);
		Account account5 = new Account(-100, true);
		Account account6 = new Account(325, false);
		Account account7 = new Account(1000, false);

		Client andrei = new Client("Andrei");
		Client sergei = new Client("Sergei");
		Client alexandr = new Client("Alexandr");

		Map<Client, Set<Account>> mapClient = new HashMap<>();

		Set<Account> accountAndrei = new HashSet<>();
		accountAndrei.add(account1);
		accountAndrei.add(account2);
		accountAndrei.add(account3);

		Set<Account> accountSergei = new HashSet<>();
		accountSergei.add(account4);
		accountSergei.add(account5);

		Set<Account> accountAlexandr = new HashSet<>();
		accountAlexandr.add(account6);
		accountAlexandr.add(account7);

		mapClient.put(andrei, accountAndrei);
		mapClient.put(alexandr, accountAlexandr);
		mapClient.put(sergei, accountSergei);

		Bank alfaBank = new Bank("Alfa Bank", mapClient);

		BankLogic bankLogic = new BankLogic();

		Print print = new Print();

		print.bank(alfaBank.getListClient());
		print.balance(bankLogic.balanceAccountNegative(alfaBank.getListClient().values()), "Balance negative account");
		print.balance(bankLogic.balanceAccountPositive(alfaBank.getListClient().values()), "Balance positive account");
		print.balance(bankLogic.balanceAccountAll(alfaBank.getListClient().values()), "Balance all account");
		print.sortAccount(bankLogic.sortAccountByBalance(alfaBank.getListClient()));
		print.searchClientByAccount(bankLogic.searchClientByAccount(alfaBank.getListClient(), 5));
		
		// Client v = new Client("V");
		// alfaBank.addClient(v, 200);

		// System.out.println(v.getAccount());

		// Map<Client, Account> client =
		// bankLogic.searchClientByAccount(alfaBank.getListClient(), 8);
		// Collection<Account> account = client.values();

		// for (Account ac: account) {
		// if (ac.getID() == 8) {
		// ac.setBalance(300);
		// }
		// }
		// System.out.println(v.getAccount());

		// System.out.println(v.getAccount());

		// v.addBalanceAccount(200, 8);

		// System.out.println (alfaBank.getListClient().get(v));
	}

}
