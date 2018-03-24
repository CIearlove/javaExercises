package Chapter06;

import java.util.Scanner;

public class Exercise_6_3_the_second_edition {

	public static void main(String[] args) {
		
		int counts[] = new int[100];
		numberOfOccurrencesOfNumbers(counts);
		printArray(counts);
		
	}
	
	public static void numberOfOccurrencesOfNumbers(int[] counts) {
		
		Scanner input = new Scanner(System.in);
		int number;
		number = input.nextInt();
//The key		
		while(number != 0){
			counts[number - 1]++;
			number = input.nextInt();
		}
	}

     public static void printArray(int[] counts) {
		
		for(int i=0;i<counts.length;i++){
			if(counts[i] > 0)
				System.out.println((i+1) + " occurs " + counts[i] + ((counts[i]==1)?" time.":" times."));
		}
		
	}
}
