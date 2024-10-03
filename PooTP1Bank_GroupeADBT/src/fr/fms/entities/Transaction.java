package fr.fms.entities;

import java.util.Date;

public class Transaction {

	private int idTransaction;
	private Date dateTransaction;
	private double amountTransaction;
	private Account account;

	public Transaction(int idTransaction, Date dateTransaction, double amountTransaction) {
		this.idTransaction = idTransaction;
		this.dateTransaction = dateTransaction;
		this.amountTransaction = amountTransaction;
	}

	public Transaction(Date dateTransaction, double amountTransaction, Account account) {
		this.dateTransaction = dateTransaction;
		this.amountTransaction = amountTransaction;
		this.account = account;
	}

	// Getters et Setters
	public void setAccount(Account account) {
		this.account = account;
	}

}
