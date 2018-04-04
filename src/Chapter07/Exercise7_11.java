package Chapter07;

import java.util.Scanner;

public class Exercise7_11 {
	
	public static void main(String[] args) {
		
		int coins[][] = new int[3][3];
		int inputValue = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 511: ");
		inputValue = input.nextInt();
		
		decimalToBinary(inputValue,coins);
		
		printCoins(coins);
	}

	/**
	 * 打印数组
	 * @param coins
	 */
	public static void printCoins(int[][] coins) {
		
		for(int i=0;i<coins.length;i++){
			for(int j=0;j<coins[i].length;j++){
				if(coins[i][j] == '\u0000'){
					System.out.print("H"+" ");
				}
				else
					System.out.print("T"+" ");
			}
			System.out.println();
		}
		
	}

	/**
	 * 将十进制数转为二进制数
	 * @param inputValue
	 * @param coins
	 */
	public static void decimalToBinary(int inputValue, int[][] coins) {
		
		int binaryNumber = 0;
		
		  for(int i=2;i>=0;i--){
			  for(int j=2;j>=0;j--){
				  
				  if(i==0 && j==0){
					  coins[i][j] = 0;
				  }
				  else
					  binaryNumber = inputValue % 2;
				      inputValue = inputValue / 2;
					  coins[i][j] = binaryNumber;
			  }
				  
		  }
	}

}
