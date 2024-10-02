package fr.fms.business;

import java.util.ArrayList;
import java.util.List;

public class TestUser {
	
	static List<Object> usersAccount = new ArrayList<Object>();
	
	public static void main(String[] args) {
		
		Admin admin = new Admin("Admin", "Maitre", "bernard.tapie@lcl.fr");
		usersAccount.add(new CurrentAccount("100200300", "2024-10-02", 1500.00, 200, admin.createUser("1", "Dupont", "Robert", "robert.dupont@xmail.com")));
		usersAccount.add(new SavingAccount("200300400", "2024-10-02", 2000.00, 5.5, admin.createUser("2", "jolie", "julie", "julie.jolie@xmail.com")));

		usersAccount.forEach((user) -> System.out.println(user));
		
		System.out.println("---------------------");
		
		usersAccount.forEach((user) -> {			
			Account account = (Account) user;
			System.out.printf("Solde de %s : %f %n",account.getUser().getFirstnameUser(), account.getBalanceAccount());			
		});
		
		System.out.println("--------------------");
		
		usersAccount.forEach((user)-> {
			
			Account account = (Account) user;
			if(account.getIdAccount().contains("100200300")) {
			System.out.printf("Id numéro %s : %n", account.getIdAccount() );
			} else {
				System.out.println("Vous demandez un compte inexistant");
			}			
		});
		
		
		
		
	}

}
