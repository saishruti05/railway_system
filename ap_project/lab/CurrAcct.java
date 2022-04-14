public class CurrAcct extends Account
{
	public static final float SERVICE_CHARGE = 100.0f;
	public CurrAcct(long number, String type, double balance, String name)
	{
		super(number, type, balance, name);
	}

	public boolean withdraw(double ammount)
	{
		if((getBalance() - ammount) >= Account.MINIMUM_BALANCE)
		{
			double balance = getBalance() - ammount;
			setBalance(balance);
			return true;
		}
		else if((getBalance() - ammount) < Account.MINIMUM_BALANCE && (getBalance() - ammount) >= 0)
		{
			double balance = getBalance() - ammount - CurrAcct.SERVICE_CHARGE;
			setBalance(balance);
			return true;
		}
		return false;
	}
}
