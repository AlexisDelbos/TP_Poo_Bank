package fr.fms;

import java.text.SimpleDateFormat;
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

		SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd");
		CurrentAccount firstAccount = new CurrentAccount(100200300, new Date(), 1500, 200, robert);
		SavingAccount secondAccount = new SavingAccount(200300400, new Date(), 2000, 5.5, julie);

		System.out.println(firstAccount);
		System.out.println(secondAccount);

		bankJob.addAccount(firstAccount);
		bankJob.addAccount(secondAccount);

		System.out.println("-------------------");
		System.out.printf("Solde de %s : %s %n", firstAccount.getUser().getFirstnameUser(),
				firstAccount.getBalanceAccount());

		System.out.printf("Solde de %s : %s %n", secondAccount.getUser().getLastnameUser(),
				secondAccount.getBalanceAccount());

		System.out.println("----Test erreur----");

		System.out.println(bankJob.consultAccount(11111111));
		bankJob.withdraw(100200300, 20000);
		bankJob.transferMoney(100200300, 100200300, 200);

		System.out.println("---- Liste des comptes de ma banque ----");

		CurrentAccount thirdAccount = new CurrentAccount(300400500, new Date(), 5000, 500, julie);
		bankJob.addAccount(thirdAccount);
		bankJob.listAllAccounts();

		System.out.println("---- Liste des comptes par mail ----");
		bankJob.listAccountByMailUser(secondAccount.getUser().getMailUser());

		System.out.println("---- Transaction de robert ---- ");

		bankJob.withdraw(firstAccount.getIdAccount(), 200);
		bankJob.deposit(firstAccount.getIdAccount(), 500);
		bankJob.listOfUserAccount(robert);

		System.out.printf("--- Liste des transactions du compte n° %d de %s ---- %n", secondAccount.getIdAccount(),
				secondAccount.getUser().getLastnameUser());

		bankJob.withdraw(secondAccount.getIdAccount(), 50);
		bankJob.deposit(secondAccount.getIdAccount(), 500);
		bankJob.listTransactionOfAccount(200300400);

	}
}
