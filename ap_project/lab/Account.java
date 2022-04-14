public abstract class Account
{
	private String accountHolderName;
	private long accountNumber;
	private String accountType; //S for saving, C for current account
	private double balance;
	public Account(long number, String type, double balance, String name)
	{
		accountNumber = number;
		accountType = type;
		this.balance = balance;
		accountHolderName = name;
	}
	public long getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public String getAccountType()
	{
		return accountType;
	}
	public void setAccountType(String accountType)
	{
		this.accountType = accountType;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void setAccountHolderName(String dipositorName)
	{
		this.accountHolderName = dipositorName;
	}
	public void deposit(double ammount)
	{
		balance = balance + ammount;
	}
	public abstract boolean withdraw(double ammount);
}