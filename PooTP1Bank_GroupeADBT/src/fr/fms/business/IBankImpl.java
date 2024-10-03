package fr.fms.business;

import java.util.HashMap;
import java.util.Map;

import fr.fms.entities.Account;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.SavingAccount;

public class IBankImpl implements IBank {

	// private ArrayList<Account> accounts;
	private Map<Integer, Account> accounts;

	// Constructeur
	public IBankImpl() {
		this.accounts = new HashMap<>();
	}

	// Ajouter un compte
	public void addAccount(Account account) {
		accounts.put(account.getIdAccount(), account);
	}

	// Déposer de l'argent sur un compte
	public void deposit(int accountId, double amount) {
		Account account = accounts.get(accountId);
		if (account != null) {
			account.setBalanceAccount(account.getBalanceAccount() + amount);
			System.out.println("Versement de " + amount + " sur le compte n° " + accountId);
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
					System.out.println("Retrait de " + amount + " sur le compte n° " + accountId);
				} else {
					System.out.println("Fonds insuffisants !");
				}
			} else if (account instanceof SavingAccount) {
				if (account.getBalanceAccount() - amount > 0) {
					account.setBalanceAccount(account.getBalanceAccount() - amount);
					System.out.println("Retrait de " + amount + " sur le compte n° " + accountId);
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

		if (startAccount.getIdAccount().equals(destinationAccount.getIdAccount())) {
			System.out.println("Vous ne pouvez pas retirer et verser sur le même compte.");
		} else{	
			if()
				startAccount.setBalanceAccount(startAccount.getBalanceAccount() - amount);
				destinationAccount.setBalanceAccount(destinationAccount.getBalanceAccount() + amount);
				System.out.printf("Transfert de %.2f effectué de %s à %s.%n", amount,
						startAccount.getUser().getFirstnameUser(), destinationAccount.getUser().getFirstnameUser());
			} else {
				System.out.println("Fonds insuffisants pour le transfert !");
			}
		}
}

// Consulter le solde d'un compte
//	public double consultBalanceAccount(String accountId) {
//		Account account = accounts.get(accountId);
//		return (account != null) ? account.getBalanceAccount() : 0; // Renvoie 0 si le compte n'existe pas
//	}

// Lister tous les comptes
//	public void listAccounts() {
//		for (Account account : accounts.values()) {
//			System.out.println("Compte n° " + account.getIdAccount() + " - Solde : " + account.getBalanceAccount());
//		}
//	}
}
