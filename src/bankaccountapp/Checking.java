package bankaccountapp;

public class Checking extends Account{
	// List properties
	private int debitCardNumber;
	private int debitCardPIN;
	
	// Constructor
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	// List methods
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 16));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	public void showInfo() {
		super.showInfo();
		System.out.println(
				" Your Checking Account Features:" +
				"\n Debit Card Number:" + debitCardNumber +
				"\n Debit Card PIN:" + debitCardPIN
				);
	}

}
