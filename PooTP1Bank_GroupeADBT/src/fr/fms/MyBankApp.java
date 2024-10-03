package fr.fms;

import java.util.Date;

import fr.fms.business.IBankImpl;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.SavingAccount;
import fr.fms.entities.User;

public class MyBankApp {

	public static void main(String[] args) {

		// Création de l'instance de IBank avec la liste des comptes
		IBankImpl bankJob = new IBankImpl();

		User robert = new User(1, "dupont", "robert", "robert.dupont@xmail.com");
		User julie = new User(2, "jolie", "julie", "julie.jolie@xmail.com");

		CurrentAccount firstAccount = new CurrentAccount(100200300, new Date(), 1500, 200, robert);
		SavingAccount secondAccount = new SavingAccount(200300400, new Date(), 2000, 5.5, julie);
		CurrentAccount thirdAccount = new CurrentAccount(300400500, new Date(), 5000, 500, julie);

		System.out.println(firstAccount);
		System.out.println(secondAccount);
		System.out.println(thirdAccount);

		bankJob.addAccount(firstAccount);
		bankJob.addAccount(secondAccount);
		bankJob.addAccount(thirdAccount);

		System.out.println("-----Dépot-----");
		bankJob.deposit(firstAccount.getIdAccount(), 500);
		bankJob.deposit(secondAccount.getIdAccount(), 1000);

		// Test de retrait
		System.out.println("----Retrait----");
		bankJob.withdraw(100200300, 250);
		bankJob.withdraw(200300400, 400);

		// Test de virement
		// bankJob.transferMoney(100200300, 200300400, 100);

	}
}
