package Chapter07;

import java.util.Scanner;

public class Exercise7_20 {

	public static void main(String[] args) {
		
		char[][] array = new char[6][7];
		printArray(array);
		
		while(true){
			
		// Prompt the first player
		makeAMove(array,'R');
		printArray(array);
		
		if(isWon('R',array)){
			System.out.println("The red player won.");
			System.exit(0);
		}
		else if(isDraw(array)){
			System.out.println("Draw.No Winner.");
			System.exit(0);
		}
		
		// Prompt the second player
			makeAMove(array,'Y');
			printArray(array);
				
			if(isWon('Y',array)){
				System.out.println("The yellow player won");
				System.exit(0);
			}
			else if(isDraw(array)){
				System.out.println("No Winner");
				System.exit(0);
			}
		}
	}

	/**
	 * �ж��ǲ���ƽ��
	 * @param array
	 * @return
	 */
	private static boolean isDraw(char[][] array) {
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				if(array[i][j] == '\u0000'){
					return false;
				}	
			}
		}
		return true;
	}

	/**
	 * �ж����R/Y��û��Ӯ
	 * @param c
	 * @param array
	 * @return
	 */
	private static boolean isWon(char c, char[][] array) {
		for(int row=0; row<array.length; row++){
			for(int col=0; col<array[row].length; col++){
				
				//�ж�ˮƽ�����Ƿ����������ĸ���ȵ���
					if(col+3 <= 6){
						if(array[row][col] == c &&
								array[row][col+1] == c &&
								array[row][col+2] == c &&
								array[row][col+3] == c){
							System.out.print("arrayData"+"["+row+"]"+"["+col+"]"+",��ˮƽ�����ϣ�");
							return true;
						}
					}
		
				//�ж���ֱ�����Ƿ����������ĸ���ȵ���
					if(row+3 <= 5){
						if(array[row][col] == c &&
								array[row+1][col] == c &&
								array[row+2][col] == c &&
								array[row+3][col] == c){
							System.out.print("arrayData"+"["+row+"]"+"["+col+"]"+",����ֱ�����ϣ�");
							return true;
						}
					}
					
				//�жϸ��Խ����Ƿ����������ĸ���ȵ���
					if(!(row+3 >= 6 || col-3 < 0)){
						if(array[row][col] == c &&
								array[row+1][col-1] == c &&
								array[row+2][col-2] == c &&
								array[row+3][col-3] == c){
							System.out.print("arrayData"+"["+row+"]"+"["+col+"]"+",�ڸ��Խ��߷����ϣ�");
							return true;
						}
					}
				
				//�ж����Խ����Ƿ����������ĸ���ȵ���
					if(!(row+3 >= 6 || col+3 >= 7)){
						if(array[row][col] == c &&
								array[row+1][col+1] == c &&
								array[row+2][col+2] == c &&
								array[row+3][col+3] == c){
							System.out.print("arrayData"+"["+row+"]"+"["+col+"]"+",�����Խ��߷����ϣ�");
							return true;
						}
					}
			}
		}
		return false;
	}

	/**
	 * �������
	 * @param array
	 * @param player
	 */
	public static void makeAMove(char[][] array, char player) {
		
		int row = -1;
		int column = -1;
		boolean occupied = false;
		
		do{
			Scanner input = new Scanner(System.in);
			System.out.print("Drop a disk at column (0-6) for player "+player+":");
			column = input.nextInt();
			
			for(row=array.length-1; row>=0; row--){
				if(array[row][column] == '\u0000'){
					array[row][column] = player;
					occupied = true;
					break;
				}
			}
			
			if(!occupied){
				System.out.println("This column is full. Try a different column.");
			}
		}
		while(!occupied);
	}

	/**
	 * ��ӡ���̵Ľ��
	 * @param array
	 */
	public static void printArray(char[][] array) {
		
		for(int i=0;i<array.length;i++){
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
		System.out.println("-----------------------------");
	}
}
