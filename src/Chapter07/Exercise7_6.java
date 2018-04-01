package Chapter07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise7_6 {
	
	public static final int RAW1 = 3;
	public static final int COL1 = 3;
	public static final int RAW2 = 3;
	public static final int COL2 = 3;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		double[][] array1 = new double[RAW1][COL1];
		double[][] array2 = new double[RAW2][COL2];
		double[][] array3 = new double[RAW1][COL2];
		
		initialArrays(array1,array2);
		calculateArray(array1,array2,array3);
		printArray(array3);
	}
	
	public static void printArray(double[][] array3) {
		for(int i=0;i<array3.length;i++){
			for(int j=0;j<array3[i].length;j++){
				System.out.print(" "+array3[i][j]);
			}
			System.out.println("\n");
		}
	}

	public static void calculateArray(double[][] array1, double[][] array2, 
			double[][] array3) {
		
		for(int i=0;i<RAW1;i++){
			for(int j=0;j<COL2;j++){
				for(int k=0;k<COL1;k++){
					array3[i][j] += array1[i][k]*array2[k][j];
				}
			}
		}
	}

	public static void initialArrays(double[][] array1,double[][] array2) throws FileNotFoundException {
		
		File file = new File("file/Arrays.txt");
		Scanner input = new Scanner(file);
		
		for(int i=0; i<3 ;i++){
			for(int j=0; j<3 ;j++){
				array1[i][j] = input.nextDouble();	
			}
		}
		
		for(int i=0; i<3 ;i++){
			for(int j=0; j<3 ;j++){
				array2[i][j] = input.nextDouble();	
			}
		}
	}
}
