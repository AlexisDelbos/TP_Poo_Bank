package fr.fms.entities;

import java.util.Date;

public class SavingAccount extends Account {

	// Taux d'interet
	private double interestRate;
	private User user;

	// Constructeur
	public SavingAccount(int idAccount, Date dateCreateAccount, double balanceAccount, double interestRate) {
		super(idAccount, dateCreateAccount, balanceAccount);
		this.interestRate = interestRate;
	}

	public SavingAccount(int idAccount, Date dateCreateAccount, double balanceAccount, double interestRate, User user) {
		super(idAccount, dateCreateAccount, balanceAccount);
		this.interestRate = interestRate;
		this.user = user;

	}

	public String toString() {
		return String.format("SavingAccount [accountId= %s, creationDate= %s, balance= %,f , %s , rate= %f %n",
				getIdAccount(), getDateCreateAccount(), getBalanceAccount(), getUser().toString(), getInterestRate());
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
