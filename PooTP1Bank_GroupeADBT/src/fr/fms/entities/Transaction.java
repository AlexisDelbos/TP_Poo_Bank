package fr.fms.entities;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaction {

	private int idTransaction;
	private Date dateTransaction;
	private double amountTransaction;
	private Account account;

	private static List<Transaction> transactions = new ArrayList<>();
	public static int transactionCounter = 0;

	public Transaction(int idTransaction, Date dateTransaction, double amountTransaction, Account account) {
		transactionCounter++;
		idTransaction = transactionCounter;
		this.dateTransaction = dateTransaction;
		this.amountTransaction = amountTransaction;
		this.account = account;
		transactions.add(this);
	}

	public Transaction(int idTransaction, Date dateTransaction, double amountTransaction) {
		this.idTransaction = idTransaction;
		this.dateTransaction = dateTransaction;
		this.amountTransaction = amountTransaction;
		transactions.add(this);

	}

	public Transaction(Date dateTransaction, double amountTransaction, Account account) {
		transactionCounter++;
		idTransaction = transactionCounter;
		this.dateTransaction = dateTransaction;
		this.amountTransaction = amountTransaction;
		this.account = account;
		transactions.add(this);

	}

	public static ArrayList<Transaction> listTransaction(int accountId) {
		ArrayList<Transaction> accountTransactions = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getAccount().getIdAccount() == accountId) {
				accountTransactions.add(transaction);
			}
		}
		return accountTransactions;
	}

	public String toString() {
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat df = new DecimalFormat("#.00");

		return String.format("Transaction [transactionId= %d, transactionDate= %s, amount= %s, accountId=%d] %n",
				getIdTransaction(), dt.format(getDateTransaction()), df.format(getAmountTransaction()),
				getAccount().getIdAccount());
	}

	// Getters et Setters
	public void setAccount(Account account) {
		this.account = account;
	}

	public int getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}

	public Date getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public double getAmountTransaction() {
		return amountTransaction;
	}

	public void setAmountTransaction(double amountTransaction) {
		this.amountTransaction = amountTransaction;
	}

	public static List<Transaction> getTransactions() {
		return transactions;
	}

	public static void setTransactions(List<Transaction> transactions) {
		Transaction.transactions = transactions;
	}

	public Account getAccount() {
		return account;
	}

}
