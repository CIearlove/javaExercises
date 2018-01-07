package javaExercise;
import java.util.ArrayList;
public class _11_8_Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TransactionAccount account = new TransactionAccount(1122,"George",1000.0,0.015);
		
		account.withDraw(5);
		
		account.deposit(3);

		account.withDraw(50);
		
		account.deposit(30);
		
	    ArrayList<?> list = account.getTransactions();
	    Transaction transaction = (Transaction) list.get(3);
	    System.out.println(":"+transaction.description);
	    
	}

}
