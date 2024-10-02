package fr.fms.business;

public class SavingAccount extends Account {

	// Taux d'interet
	private double interestRate;
	private User user;
	
	// Constructeur 
	public SavingAccount(String idAccount, String dateCreateAccount,double balanceAccount, double interestRate) {
		super(idAccount, dateCreateAccount, balanceAccount);
		this.interestRate = interestRate;
	}	
	
    public SavingAccount(String idAccount,String dateCreateAccount, double balanceAccount,  double interestRate,User user) {
        super(idAccount, dateCreateAccount, balanceAccount);
        this.interestRate = interestRate;
        this.user = user;
        
    }
    
	
	@Override
    public void withdraw(double withdrawAmount) {
        if (getBalanceAccount() - withdrawAmount < 0) {
            System.out.println("Vous avez dépassé vos capacités de retrait.");
        }
        setBalanceAccount(getBalanceAccount() - withdrawAmount);
    }
	
    public String toString() {
    	return String.format("[accountId= %s, creationDate= %s, balance= %,f , %s , %f ",  getIdAccount(), getDateCreateAccount(), getBalanceAccount(), getUser().toString(), getInterestRate());
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
