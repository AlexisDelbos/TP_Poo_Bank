package fr.fms.business;

public class CurrentAccount extends Account {

    private double authorizedOverdraft;
    private User user;    
    
    
    public CurrentAccount(String idAccount,String dateCreateAccount, double balanceAccount, double authorizedOverdraft) {
        super(idAccount, dateCreateAccount, balanceAccount);
        this.authorizedOverdraft = authorizedOverdraft;
    }
    public CurrentAccount(String idAccount,String dateCreateAccount, double balanceAccount,  double authorizedOverdraft,User user) {
        super(idAccount, dateCreateAccount, balanceAccount);
        this.authorizedOverdraft = authorizedOverdraft;
        this.user = user;
    }
    

    @Override
    public void withdraw(double withdrawAmount) {
        if (getBalanceAccount() - withdrawAmount < -authorizedOverdraft) {
            System.out.println("Vous avez dépassé vos capacités de retrait.");
        }
        setBalanceAccount(getBalanceAccount() - withdrawAmount);
    }
    
    public String toString() {
    	return String.format("[accountId= %s, creationDate= %s, balance= %,f , %s , %f ",  getIdAccount(), getDateCreateAccount(), getBalanceAccount(), getUser().toString(), getAuthorizedOverdraft());
    }
    
	public double getAuthorizedOverdraft() {
		return authorizedOverdraft;
	}
	
	public void setAuthorizedOverdraft(double authorizedOverdraft) {
		this.authorizedOverdraft = authorizedOverdraft;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
