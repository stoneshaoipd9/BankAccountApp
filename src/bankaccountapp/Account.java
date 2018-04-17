package bankaccountapp;

public abstract class Account implements IBaseRate{
	// List common properties
	private String name;
	private String sSN;
	private double balance;
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	// Constructor
	public Account(String name, String sSN, double initDeposit) {
		index++;
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposit;
		this.accountNumber = setAccountNumber();
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length()-1);
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	// List common methods
	public void showInfo() {
		
	}
}
