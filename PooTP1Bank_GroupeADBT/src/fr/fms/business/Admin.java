package fr.fms.business;

public class Admin extends User {
	
		
	public Admin(String firstnameUser, String lastnameUser, String mailUser) {
		super(firstnameUser, lastnameUser, mailUser);
	}
	
	public User createUser(String idUser, String firstnameUser, String lastnameUser, String mailUser) {
		return new User(idUser, firstnameUser, lastnameUser, mailUser);
	}
 
	
	public void researchAccount() {
		
	}

	
}
