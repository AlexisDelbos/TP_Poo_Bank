package fr.fms.business;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import fr.fms.entities.Account;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.SavingAccount;
import fr.fms.entities.Transaction;
import fr.fms.entities.Transfert;
import fr.fms.entities.User;
import fr.fms.entities.Withdraw;

public class IBankImpl implements IBank {

	private Map<Integer, Account> accounts;
	SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd");

	// Constructeur
	public IBankImpl() {
		this.accounts = new HashMap<>();
	}

	// Ajouter un compte
	public void addAccount(Account account) {
		accounts.put(account.getIdAccount(), account);
	}

	// renvoie le compte correspondant à l'id sur une HashMap avec keySet pour la
	public Account consultAccount(int accountId) {
		Account account = accounts.get(accountId);
		for (int i : accounts.keySet()) {
			if (i == accountId) {
				account = accounts.get(i);
			}
		}
		if (account == null) {
			System.out.println("Compte non trouvé !");
		}
		return account;
	}

	// Déposer de l'argent sur un compte
	public void deposit(int accountId, double amount) {
		Account account = accounts.get(accountId);
		if (account != null) {
			account.setBalanceAccount(account.getBalanceAccount() + amount);
			new Transfert(new Date(), amount, account);
		} else {
			System.out.println("Compte non trouvé !");
		}
	}

	// Retirer de l'argent d'un compte
	public void withdraw(int accountId, double amount) {
		Account account = accounts.get(accountId);
		if (account != null) {

			if (account instanceof CurrentAccount) {
				CurrentAccount currentAccount = (CurrentAccount) account;
				if (account.getBalanceAccount() - amount >= -currentAccount.getAuthorizedOverdraft()) {
					account.setBalanceAccount(account.getBalanceAccount() - amount);
					new Withdraw(new Date(), -amount, account);
				} else {
					System.out.println("Fonds insuffisants !");
				}
			} else if (account instanceof SavingAccount) {
				if (account.getBalanceAccount() - amount > 0) {
					account.setBalanceAccount(account.getBalanceAccount() - amount);
					new Withdraw(new Date(), -amount, account);

				} else {
					System.out.println("Fonds insuffisants !");
				}
			}
		} else {
			System.out.println("Compte non trouvé !");
		}
	}

	// Transférer de l'argent entre deux comptes
	public void transferMoney(int startAccountId, int destinationAccountId, double amount) {
		Account startAccount = accounts.get(startAccountId);
		Account destinationAccount = accounts.get(destinationAccountId);

		if (startAccount == null || destinationAccount == null) {
			System.out.println("Un des comptes n'existe pas !");
			return;
		}

		if (startAccountId == destinationAccountId) {
			System.out.println("Vous ne pouvez pas retirer et verser sur le même compte.");
			return;
		}

		if (startAccount instanceof CurrentAccount) {
			CurrentAccount currentAccount = (CurrentAccount) startAccount;
			if (currentAccount.getBalanceAccount() - amount >= -currentAccount.getAuthorizedOverdraft()) {
				currentAccount.setBalanceAccount(currentAccount.getBalanceAccount() - amount);
			} else {
				System.out.println("Fonds insuffisants sur le compte courant !");
				return;
			}
		} else if (startAccount instanceof SavingAccount) {
			if (startAccount.getBalanceAccount() - amount >= 0) {
				startAccount.setBalanceAccount(startAccount.getBalanceAccount() - amount);
			} else {
				System.out.println("Fonds insuffisants sur le compte d'épargne !");
				return;
			}
		}
		destinationAccount.setBalanceAccount(destinationAccount.getBalanceAccount() + amount);

		// System.out.printf("Transfert de %.2f effectué de %s à %s.%n", amount,
		// startAccount.getUser().getFirstnameUser(),
		// destinationAccount.getUser().getFirstnameUser());
	}

	public void listAllAccounts() {
		for (Account account : accounts.values()) {
			System.out.println(account);
		}
	}

	public void listAccountByMailUser(String mailUser) {
		for (Account account : accounts.values()) {
			if (account.getUser().getMailUser().equalsIgnoreCase(mailUser)) {
				System.out.println(account);
			}
		}
	}

	// Afficher d'un compte
	public void listTransactionOfAccount(int accountId) {
		ArrayList<Transaction> transactions = Transaction.listTransaction(accountId);
		for (Transaction transaction : transactions) {
			System.out.println(transaction);

		}

	}

	// Afficher d'une personne
	public void listOfUserAccount(User user) {

		for (Account account : accounts.values()) {
			if (account.getUser().equals(user)) {
				listTransactionOfAccount(account.getIdAccount());

			}
		}

	}
}
