package fr.fms.business;

public class User {

	private String idUser;
	private String firstnameUser;
	private String lastnameUser;
	private String mailUser;
	
	
	public User(String idUser, String firstnameUser, String lastnameUser, String mailUser) {
		this.idUser = idUser;
		this.firstnameUser = firstnameUser;
		this.lastnameUser = lastnameUser;
		this.mailUser = mailUser;
	}
	
	public User(String firstnameUser, String lastnameUser, String mailUser) {
		this.firstnameUser = firstnameUser;
		this.lastnameUser = lastnameUser;
		this.mailUser = mailUser;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getFirstnameUser() {
		return firstnameUser;
	}

	public void setFirstnameUser(String firstnameUser) {
		this.firstnameUser = firstnameUser;
	}

	public String getLastnameUser() {
		return lastnameUser;
	}

	public void setLastnameUser(String lastnameUser) {
		this.lastnameUser = lastnameUser;
	}

	public String getMailUser() {
		return mailUser;
	}

	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}

	public String toString() {
		return String.format("[accountId = %s, firstname= %s, lastname= %s, email= %s ]", idUser, firstnameUser, lastnameUser, mailUser);
	}
}
