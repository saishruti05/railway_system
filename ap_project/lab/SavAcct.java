
import java.util.*;
public class SavAcct extends Account
{
	public static final double MINIMUM_BALANCE=10000;
	public static final float interestRate = 0.03f;
	private Date lastInterestDate = null;
	private double interest=0;
	public SavAcct(long number, String type, double balance, String name)
	{
		super(number, type, balance, name);
		lastInterestDate=new Date();
	}
	public boolean withdraw(double ammount)
	{
		if((getBalance() - ammount) >= Account.MINIMUM_BALANCE)
		{
			double balance = getBalance() - ammount;
			setBalance(balance);
			return true;
		}
		return false;
	}
	public double calculateInterest()
	{
		Date currentDate = new Date();
		long diff = currentDate.getTime() - lastInterestDate.getTime(); //difference in ms
		int days = (int) (diff / (1000.0*60*60*24));
		System.out.println("Days : " + days);
		interest = getBalance() * SavAcct.interestRate * days / 365; //formula to calculate interest
		lastInterestDate = currentDate;
		return interest;
	}
}