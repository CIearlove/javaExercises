package javaExercise;

public class _8_7_TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1122,20000.0,0.045);
		account.withDraw(2500);
		account.deposit(3000);
		
		System.out.println(""+account.getBalance()+"\n"+account.getDateCreated());
	}

}
