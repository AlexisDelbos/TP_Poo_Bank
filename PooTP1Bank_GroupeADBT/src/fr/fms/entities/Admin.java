package fr.fms.entities;

import java.util.List;

public class Admin extends User {

	public Admin(String firstnameUser, String lastnameUser, String mailUser) {
		super(firstnameUser, lastnameUser, mailUser);
	}

	public User createUser(int idUser, String firstnameUser, String lastnameUser, String mailUser) {
		return new User(idUser, firstnameUser, lastnameUser, mailUser);
	}

	// Affichage de tous les comptes
	public void displayAllAcounts(List<Account> usersAccount) {
		System.out.println("-----------Liste des comptes de la banque -------------");
		for (Account account : usersAccount) {
			System.out.println(account.toString());
		}
		System.out.println("--------------");
	}

	public void searchAccountByIdUser(int idUser, List<Account> usersAccount) {
		boolean found = false;
		for (Account account : usersAccount) {
			if (account.getUser().getIdUser() == idUser) {
				System.out.println(account);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Aucun compte trouvé pour cet utilisateur.");
		}
	}
}
