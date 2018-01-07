package javaExampleBefore;

import java.util.Scanner;
public class AnalyzeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER_OF_ELEMENTS = 10;
		double[] numbers = new double[NUMBER_OF_ELEMENTS];
		double sum =0;
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<NUMBER_OF_ELEMENTS;i++){
			System.out.println("Enter a double:");
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		System.out.println("sum:"+sum);
		double average = sum/NUMBER_OF_ELEMENTS;
		int count=0;
		for(int i=0;i<NUMBER_OF_ELEMENTS;i++){
			if(numbers[i]>average){
				count++;
			}
		}
		System.out.println("Average:"+average);
		System.out.println("Number of elememts above the average:"+count);
		
	}

}
