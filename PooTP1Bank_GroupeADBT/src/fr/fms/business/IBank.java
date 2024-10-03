package fr.fms.business;

import fr.fms.entities.Account;

public interface IBank {

	// Ajouter un nouveau compte
	public void addAccount(Account account);

	// Déposer de l'argent
	public void deposit(int accountId, double amount);

	// Retirer de l'argent d'un compte
	public void withdraw(int idAccount, double amount);

	// Transférer de l'argent entre deux comptes
	public void transferMoney(int startAccountId, int destinationAccountId, double amount);

}
