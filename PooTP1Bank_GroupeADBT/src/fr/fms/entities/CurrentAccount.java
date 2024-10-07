package fr.fms.entities;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentAccount extends Account {

	private double authorizedOverdraft;

	public CurrentAccount(int idAccount, Date dateCreateAccount, double balanceAccount, double authorizedOverdraft) {
		super(idAccount, dateCreateAccount, balanceAccount);
		this.authorizedOverdraft = authorizedOverdraft;
	}

	public CurrentAccount(int idAccount, Date dateCreateAccount, double balanceAccount, double authorizedOverdraft,
			User user) {
		super(idAccount, dateCreateAccount, balanceAccount, user);
		this.authorizedOverdraft = authorizedOverdraft;
	}

	@Override
	public String toString() {
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat df = new DecimalFormat("#.00");
		return String.format(
				"CurrentAccount [accountId= %s, creationDate= %s, balance= %s, %n %s, authorizedOverdraft= %.2f]",
				getIdAccount(), dt.format(getDateCreateAccount()), df.format(getBalanceAccount()), getUser().toString(),
				getAuthorizedOverdraft());
	}

	public double getAuthorizedOverdraft() {
		return authorizedOverdraft;
	}

	public void setAuthorizedOverdraft(double authorizedOverdraft) {
		this.authorizedOverdraft = authorizedOverdraft;
	}

}
