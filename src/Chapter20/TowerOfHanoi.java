package Chapter20;

import java.util.Scanner;

public class TowerOfHanoi {
	private static int count = 0;
	

	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
		
		if(n == 1){//Stopping condition
			count++;
			System.out.println(count+" Move disk "+n+" from "+fromTower+" to "+toTower);
			
		}
		else{
			moveDisks(n-1,fromTower,auxTower,toTower);
			count++;
			System.out.println(count+" Move disk "+n+" from "+fromTower+" to "+toTower);
			moveDisks(n-1,auxTower,toTower,fromTower);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		int count = 0;
		//Find the solution recursively
		System.out.println("The moves are:");
		moveDisks(n,'A','B','C');
	}
}
