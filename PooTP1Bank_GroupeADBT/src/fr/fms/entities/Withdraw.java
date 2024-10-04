package fr.fms.entities;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Withdraw extends Transaction {

	public Withdraw(Date dateTransaction, double amountTransaction, Account account) {
		super(dateTransaction, amountTransaction, account);
	}

	@Override
	public String toString() {
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat df = new DecimalFormat("#.00");

		return String.format(
				"Retrait : Transaction [transactionId= %d, transactionDate= %s, amount= %s, accountId=%d] %n",
				getIdTransaction(), dt.format(getDateTransaction()), df.format(getAmountTransaction()),
				getAccount().getIdAccount());
	}

}
