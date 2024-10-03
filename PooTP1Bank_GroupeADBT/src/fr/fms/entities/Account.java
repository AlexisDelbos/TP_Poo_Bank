package fr.fms.entities;

import java.util.Date;

public class Account {

	private int idAccount;
	private Date dateCreateAccount;
	private double balanceAccount;
	protected User user;

	public Account(int idAccount, Date dateCreateAccount, double balanceAccount) {
		this.idAccount = idAccount;
		this.dateCreateAccount = dateCreateAccount;
		this.balanceAccount = balanceAccount;
	}

	public Account(int idAccount, Date dateCreateAccount, double balanceAccount, User user) {
		this.idAccount = idAccount;
		this.dateCreateAccount = dateCreateAccount;
		this.balanceAccount = balanceAccount;
		this.user = user;
	}

	public Integer getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Integer idAccount) {
		this.idAccount = idAccount;
	}

	public double getBalanceAccount() {
		return balanceAccount;
	}

	public void setBalanceAccount(double balanceAccount) {
		this.balanceAccount = balanceAccount;
	}

	public Date getDateCreateAccount() {
		return dateCreateAccount;
	}

	public void setDateCreateAccount(Date dateCreateAccount) {
		this.dateCreateAccount = dateCreateAccount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
