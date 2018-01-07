package javaExercise;

public class _11_3_TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount savingAccount = new SavingAccount(1,200.0,0.05);
		savingAccount.withDraw(199);
		
		CheckingAccount checkingAccount = new CheckingAccount(2,400,0.06);
		checkingAccount.deposit(200);
		checkingAccount.withDraw(600);
		checkingAccount.withDraw(1000);
		checkingAccount.withDraw(10);
	}

}
