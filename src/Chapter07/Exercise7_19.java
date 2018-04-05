package Chapter07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise7_19 {

	public static void main(String[] args) throws FileNotFoundException {
		
		int[][] arrayData = new int[6][7];
		inputData(arrayData);
		if(analyzeData(arrayData)){
			System.out.println("isConsecutiveFour");
		}
		else
			System.out.println("isNotConsecutiveFour");
	}

	/**
	 * 判断数据中是否有连续的四个相等的数
	 * @param arrayData
	 */
	public static boolean analyzeData(int[][] arrayData) {
		
		for(int row=0; row<arrayData.length; row++){
			for(int col=0; col<arrayData[row].length; col++){
				
				//判断水平方向是否有连续的四个相等的数
					if(col+3 <= 6){
						if(arrayData[row][col] == arrayData[row][col+1] &&
								arrayData[row][col+1] == arrayData[row][col+2] &&
								arrayData[row][col+2] == arrayData[row][col+3]){
							System.out.print("arrayData"+"["+row+"]"+"["+col+"]"+",在水平方向上：");
							return true;
						}
					}
		
				//判断竖直方向是否有连续的四个相等的数
					if(row+3 <= 5){
						if(arrayData[row][col] == arrayData[row+1][col] &&
								arrayData[row+1][col] == arrayData[row+2][col] &&
								arrayData[row+2][col] == arrayData[row+3][col]){
							System.out.print("arrayData"+"["+row+"]"+"["+col+"]"+",在竖直方向上：");
							return true;
						}
					}
					
				//判断副对角线是否有连续的四个相等的数
					if(!(row+3 >= 6 || col-3 < 0)){
						if(arrayData[row][col] == arrayData[row+1][col-1] &&
								arrayData[row+1][col-1] == arrayData[row+2][col-2] &&
								arrayData[row+2][col-2] == arrayData[row+3][col-3]){
							System.out.print("arrayData"+"["+row+"]"+"["+col+"]"+",在副对角线方向上：");
							return true;
						}
					}
				
				//判断主对角线是否有连续的四个相等的数
					if(!(row+3 >= 6 || col+3 >= 7)){
						if(arrayData[row][col] == arrayData[row+1][col+1] &&
								arrayData[row+1][col+1] == arrayData[row+2][col+2] &&
								arrayData[row+2][col+2] == arrayData[row+3][col+3]){
							System.out.print("arrayData"+"["+row+"]"+"["+col+"]"+",在主对角线方向上：");
							return true;
						}
					}
			}
		}
		return false;
		
	}

	/**
	 * 将文件中的数据录入数组中
	 * @param arrayData
	 * @throws FileNotFoundException 
	 */
	public static void inputData(int[][] arrayData) throws FileNotFoundException {
		
		File file = new File("file/exercise7_19(1).txt");
		Scanner input = new Scanner(file);
		
		for(int i=0;i<arrayData.length;i++){
			for(int j=0;j<arrayData[i].length;j++){
				arrayData[i][j] = input.nextInt();
			}	
		}
	}

}
