package Chapter08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise8_13 {

	public static void main(String[] args) throws FileNotFoundException {
		
		double twoDimensionalArray[][] = new double[3][4];
		
		enterATwoDimensionalArray(twoDimensionalArray);
		
		Location location = new Location();

		location = locateLargest(twoDimensionalArray);
		
		System.out.println("The location of the largest element is "
		+location.getMaxValue()+" at "+"("+location.getRow()+","+location.getColumn()+")");
	}

	/**
	 * 返回一个二维数组中最大值的位置
	 * @param twoDimensionalArray
	 * @return Location
	 */
	public static Location locateLargest(double[][] twoDimensionalArray) {
		
		double MaxValue = twoDimensionalArray[0][0];
		int row = 0;
		int col = 0;
		
		for(int i=0;i<twoDimensionalArray.length;i++){
			for(int j=0;j<twoDimensionalArray[i].length;j++){
				if(twoDimensionalArray[i][j] > MaxValue){
					MaxValue = twoDimensionalArray[i][j];
					row = i;
					col = j;
				}
			}
		}
		return new Location(row,col,MaxValue);
	}

	/**
	 * 从文件中读入一个二维数组
	 * @param twoDimensionalArray
	 * @throws FileNotFoundException
	 */
	public static void enterATwoDimensionalArray(double[][] twoDimensionalArray) throws FileNotFoundException {
		File file = new File("file/exercise8_13.txt");
		Scanner input = new Scanner(file);
		
		for(int i=0;i<twoDimensionalArray.length;i++){
			for(int j=0;j<twoDimensionalArray[i].length;j++){
				twoDimensionalArray[i][j] = input.nextDouble();
			}	
		}
	}

}
