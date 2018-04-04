package Chapter07;

import java.util.Scanner;

public class Exercise7_9 {

	public static void main(String[] args) {
		
		char[][] array = new char[3][3];
		printArray(array);
		
		while(true){
			
		// Prompt the first player
		makeAMove(array,'X');
		printArray(array);
		
		if(isWon('X',array)){
			System.out.println("X player won");
			System.exit(0);
		}
		else if(isDraw(array)){
			System.out.println("No Winner");
			System.exit(0);
		}
		
		// Prompt the second player
			makeAMove(array,'O');
			printArray(array);
				
			if(isWon('O',array)){
				System.out.println("O player won");
				System.exit(0);
			}
			else if(isDraw(array)){
				System.out.println("No Winner");
				System.exit(0);
			}
		}
		
	}

	public static boolean isDraw(char[][] array) {
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				if(array[i][j] == '\u0000'){
					return false;
				}	
			}
		}
		return true;
	}

	public static boolean isWon(char c, char[][] array) {
		
		for(int i=0;i<3;i++){
			if(array[i][0] == c && array[i][1] == c && array[i][2] == c)
				return true;
		}
		
		for(int j=0;j<3;j++){
			if(array[0][j] == c && array[1][j] == c && array[2][j] == c)
				return true;
		}
		
		if(array[0][0] == c && array[1][1] == c && array[2][2] == c)
			return true;
		
		if(array[0][2] == c && array[1][1] == c && array[2][0] == c)
			return true;
		
		return false;
	}

	public static void makeAMove(char[][] array, char player) {
		
		    int row = -1;
			int column = -1;
			boolean occupied = false;
			
			do{
				Scanner input = new Scanner(System.in);
				System.out.print("Enter a row(1, 2, or 3) for player "+player+":");
				row = input.nextInt();
				System.out.print("Enter a row(1, 2, or 3) for player "+player+":");
				column = input.nextInt();
				
				if(array[row][column] == '\u0000'){
					array[row][column] = player;
					occupied = true;
				}
				else
					System.out.println("Already occupied.");
			}
			while(!occupied);
	}

	public static void printArray(char[][] array) {
		
		for(int i=0;i<array.length;i++){
			System.out.println("-------------");
			System.out.print("|");
			for(int j=0;j<array[i].length;j++){
				if(array[i][j] == 0){
					System.out.print("   |");
				}
				else
					System.out.print(" "+array[i][j]+" |");
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
	
}
