package Chapter07;

import java.util.Scanner;

public class Exercise7_14 {
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size for the matrix: ");
		Scanner input = new Scanner(System.in);
		
		//二维方阵的规模
		int sizeForMatrix = 0;
		sizeForMatrix = input.nextInt();
		int matrix[][] = new int[sizeForMatrix][sizeForMatrix];
		
		//初始化数组
		for(int i=0;i<sizeForMatrix;i++){
			for(int j=0;j<sizeForMatrix;j++){
				matrix[i][j] = (int)(Math.random()+0.5);
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		//判断整行、整列、或者对角线是否是0或1的行、列和对角线
		isConsecutive(matrix);
	}

	/**
	 * 判断整行、整列、或者对角线是否是0或1的行、列和对角线
	 * @param matrix
	 */
	public static void isConsecutive(int[][] matrix) {
		
		//判断整行是否是0或1
		for(int i=0;i<matrix.length;i++){
			if(isConsecutive(matrix[i])){
				System.out.println("All "+matrix[i][0]+"s"+" on row "+i);
			}
		}
		
		//判断整列是否是0或1
		int column[] = new int[matrix.length];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				column[j] = matrix[j][i];
			}
			if(isConsecutive(column)){
				System.out.println("All "+column[0]+"s"+" on col "+i);
			}
		}
		
		//判断主对角线是否是0或1
		int majorDiagonal[] = new int[matrix.length];
		for(int i=0;i<matrix.length;i++){
			majorDiagonal[i] = matrix[i][i];
		}
		if(isConsecutive(majorDiagonal)){
			System.out.println("All "+majorDiagonal[0]+"s"+" on the majordiagonal. ");
		}
	
		//判断副对角线是否是0或1
		int subDiagonal[] = new int[matrix.length];
		for(int i=0;i<matrix.length;i++){
			subDiagonal[i] = matrix[i][matrix.length-1-i];
		}
		if(isConsecutive(subDiagonal)){
			System.out.println("All "+subDiagonal[0]+"s"+" on the subdiagonal. ");
		}
	}

	public static boolean isConsecutive(int[] array) {
		
		for(int i=0;i<array.length-1;i++){
			if(array[i] != array[i+1]){
				return false;
			}
		}
		return true;
	}
}
