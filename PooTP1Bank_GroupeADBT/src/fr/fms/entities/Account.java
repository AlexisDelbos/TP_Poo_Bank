package fr.fms.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

	private int idAccount;
	private Date dateCreateAccount;
	private double balanceAccount;
	protected User user;
	private List<Transaction> transactions;
	public List<Account> accountList;

	public Account(int idAccount, Date dateCreateAccount, double balanceAccount, User user,
			List<Transaction> transactions) {
		this.idAccount = idAccount;
		this.dateCreateAccount = dateCreateAccount;
		this.balanceAccount = balanceAccount;
		this.user = user;
		this.transactions = new ArrayList<>();
	}

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

	public Account() {
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

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

}
