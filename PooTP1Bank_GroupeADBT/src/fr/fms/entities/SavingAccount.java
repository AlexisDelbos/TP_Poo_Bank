package fr.fms.entities;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SavingAccount extends Account {

	// Taux d'interet
	private double interestRate;

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
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat df = new DecimalFormat("#.00");

		return String.format("SavingAccount [accountId= %s, creationDate= %s, balance= %s, %n %s , rate= %f %n",
				getIdAccount(), dt.format(getDateCreateAccount()), df.format(getBalanceAccount()), getUser().toString(),
				getInterestRate());
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
