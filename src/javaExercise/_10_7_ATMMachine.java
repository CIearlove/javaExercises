package javaExercise;
import java.util.Scanner;
public class _10_7_ATMMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account[] account = new Account[10];
		initialize(account);
		inAction(account);
		
		
	}
	
	public static void initialize(Account[] account){
		for(int i=0;i<account.length;i++){
			account[i] = new Account(i,100.0,0.05);
		}
	}
	
	public static boolean validateID(int enterID){
		
		if(enterID < 10){
			return true;
		}
		else
			return false;
	}
	
	public static void Menu(int enterID,Account[] account){
		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a choice:");
		int enterChoice = input.nextInt();
		
		switch(enterChoice){
		
		case 1: getBalance(enterID,account); break;
		case 2: withdraw(enterID,account); break;
		case 3: deposit(enterID,account); break;
		default: exit(account);
		/*
		
		
		
	*/
		}
	}
	
	public static void getBalance(int enterID,Account[] account){
		System.out.println("The balance is "+account[enterID].getBalance());
		Menu(enterID,account);
	}
	
	public static void inAction(Account[] account){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ID:");
		int enterID = input.nextInt();
		
		while(true){
			if(validateID(enterID)){
				Menu(enterID,account);
				break;
			}
			else{
				System.out.println("Enter an ID:");
				enterID = input.nextInt();
			}
		}
	}
	
	public static void exit(Account[] account){
		inAction(account);
	}
	
	public static void withdraw(int enterID,Account[] account){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount to withdraw");
		double withdraw = input.nextDouble();
		account[enterID].withDraw(withdraw);
		Menu(enterID,account);
	}
	
	public static void deposit(int enterID,Account[] account){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount to deposit:");
		double deposit = input.nextDouble();
		account[enterID].deposit(deposit);
		Menu(enterID,account);
	}
}

