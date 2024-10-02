package fr.fms.business;

import java.util.List;

public abstract class Account {

	private String idAccount;
	private String dateCreateAccount;
	private double balanceAccount;
	private User user;
	
	
	public Account(String idAccount, String dateCreateAccount, double balanceAccount) {		
		this.idAccount = idAccount;
		this.dateCreateAccount = dateCreateAccount;
		this.balanceAccount = balanceAccount;
	}
	
	public Account(String idAccount, String dateCreateAccount, double balanceAccount, User user) {		
		this.idAccount = idAccount;
		this.dateCreateAccount = dateCreateAccount;
		this.balanceAccount = balanceAccount;
		this.user = user;
	}
	
	

	public String getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(String idAccount) {
		this.idAccount = idAccount;
	}

	public double getBalanceAccount() {
		return balanceAccount;
	}

	public void setBalanceAccount(double balanceAccount) {
		this.balanceAccount = balanceAccount;
	}
	
	public abstract void withdraw(double withdrawAmount);
	
	public void deposit(double amount) {
		this.balanceAccount += amount;
	}



	public String getDateCreateAccount() {
		return dateCreateAccount;
	}



	public void setDateCreateAccount(String dateCreateAccount) {
		this.dateCreateAccount = dateCreateAccount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	
	
	
}
