package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		Checking chkacc01 = new Checking("Wei Shao", "saving", 5000); 
		Saving savacc01 = new Saving("XJ Kong", "checking", 1500); 
		chkacc01.showInfo();
		System.out.println("_______________");
		savacc01.showInfo();
	}

}
