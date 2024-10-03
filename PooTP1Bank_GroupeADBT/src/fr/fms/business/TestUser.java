//package fr.fms.business;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import fr.fms.entities.Admin;
//
//public class TestUser {
//
//	static List<Account> usersAccount = new ArrayList<>();
//
//	public static void main(String[] args) {
//
//		// Création des comptes & admin
//
//		Admin admin = new Admin("Admin", "Maitre", "bernard.tapie@lcl.fr");
//		usersAccount.add(new CurrentAccount("100200300", "2024-10-02", 1500.00, 200,
//				admin.createUser("1", "Dupont", "Robert", "robert.dupont@xmail.com")));
//		usersAccount.add(new SavingAccount("200300400", "2024-10-02", 2000.00, 5.5,
//				admin.createUser("2", "jolie", "julie", "julie.jolie@xmail.com")));
//
//		admin.displayAllAcounts(usersAccount);
//
//		System.out.println("--------------------");
//
//		// Gestion Erreur :
//
//		// Recherche d'un compte avec l'id du compte
//		admin.searchAccountById("5050555", usersAccount);
//
//		// Retrait Test
//		Account account1 = admin.searchAccountById("100200300", usersAccount);
//		account1.withdraw(20000);
//
//		// Virement test
//		admin.transferMoney(account1, account1, 100);
//
//		// Affichage de tous les comptes de la banque
//		admin.displayAllAcounts(usersAccount);
//
//		// Rechercher par mailUser ou idUser (a demander)
//		usersAccount.add(new CurrentAccount("300400500", "2024-10-02", 750.00, 150,
//				admin.createUser("2", "jolie", "julie", "julie.jolie@xmail.com")));
//		admin.searchAccountByIdUser("3", usersAccount);
//	}
//
//}
