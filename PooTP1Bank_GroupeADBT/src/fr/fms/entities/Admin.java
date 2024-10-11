package fr.fms.entities;

public class Admin extends User {

	public Admin(String firstnameUser, String lastnameUser, String mailUser) {
		super(firstnameUser, lastnameUser, mailUser);
	}

	public User createUser(int idUser, String firstnameUser, String lastnameUser, String mailUser) {
		return new User(idUser, firstnameUser, lastnameUser, mailUser);
	}
}
