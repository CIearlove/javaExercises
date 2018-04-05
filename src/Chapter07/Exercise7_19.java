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
	 * �ж��������Ƿ����������ĸ���ȵ���
	 * @param arrayData
	 */
	public static boolean analyzeData(int[][] arrayData) {
		
		for(int row=0; row<arrayData.length; row++){
			for(int col=0; col<arrayData[row].length; col++){
				
				//�ж�ˮƽ�����Ƿ����������ĸ���ȵ���
					if(col+3 <= 6){
						if(arrayData[row][col] == arrayData[row][col+1] &&
								arrayData[row][col+1] == arrayData[row][col+2] &&
								arrayData[row][col+2] == arrayData[row][col+3]){
							System.out.print("arrayData"+"["+row+"]"+"["+col+"]"+",��ˮƽ�����ϣ�");
							return true;
						}
					}
		
				//�ж���ֱ�����Ƿ����������ĸ���ȵ���
					if(row+3 <= 5){
						if(arrayData[row][col] == arrayData[row+1][col] &&
								arrayData[row+1][col] == arrayData[row+2][col] &&
								arrayData[row+2][col] == arrayData[row+3][col]){
							System.out.print("arrayData"+"["+row+"]"+"["+col+"]"+",����ֱ�����ϣ�");
							return true;
						}
					}
					
				//�жϸ��Խ����Ƿ����������ĸ���ȵ���
					if(!(row+3 >= 6 || col-3 < 0)){
						if(arrayData[row][col] == arrayData[row+1][col-1] &&
								arrayData[row+1][col-1] == arrayData[row+2][col-2] &&
								arrayData[row+2][col-2] == arrayData[row+3][col-3]){
							System.out.print("arrayData"+"["+row+"]"+"["+col+"]"+",�ڸ��Խ��߷����ϣ�");
							return true;
						}
					}
				
				//�ж����Խ����Ƿ����������ĸ���ȵ���
					if(!(row+3 >= 6 || col+3 >= 7)){
						if(arrayData[row][col] == arrayData[row+1][col+1] &&
								arrayData[row+1][col+1] == arrayData[row+2][col+2] &&
								arrayData[row+2][col+2] == arrayData[row+3][col+3]){
							System.out.print("arrayData"+"["+row+"]"+"["+col+"]"+",�����Խ��߷����ϣ�");
							return true;
						}
					}
			}
		}
		return false;
		
	}

	/**
	 * ���ļ��е�����¼��������
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
