package Chapter07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise7_17 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//����i���������j�Ĵ����
		double borrowers[][] = new double[5][5];
		//��5�����е�ԭʼ�ʲ�
		int originalAssets[] = new int[5];
		
		initializeData(borrowers,originalAssets);
		
		//��5�����зֱ�������ٸ�����
		int numberOfBank[] = new int[5];
		numberOfBank(borrowers,numberOfBank);
		
		bankingRelationships(originalAssets,numberOfBank,borrowers);
		
		//��ʾҪ�������а�ȫ����С���ʲ�
		int limit = 201;
		unsafeBanks(borrowers,originalAssets,limit);
	}

	/**
	 * �ٸ����ӡ�
	 * ����3�����ʲ���75+125�������������limit֮�µġ����ԣ�����3�ǲ���ȫ�ġ�
	 * ����3��ò���ȫ֮������1�����ʲ�Ҳ��Ϊ125+40.���ԣ�����1Ҳ����ȫ��
	 * @param borrowers
	 * @param originalAssets
	 * @param limit
	 */
	public static void unsafeBanks(double[][] borrowers, int[] existingAssets, int limit) {
		
		int original[] = new int[5];
		
		for(int m=0;m<original.length;m++){
			original[m] = existingAssets[m];
		}
	
		//��ʾ��������Ƿ��ǲ���ȫ��
		boolean isChecked[] = new boolean[5];
		
		int i;
		int j;
		//�������е�������Ч�ʲ�
		for(i=0;i<borrowers.length;i++){
			for(j=0;j<borrowers[i].length;j++){
				if(borrowers[i][j] != '\u0000'){
					existingAssets[i] += borrowers[i][j];
				}
			}

			if(isChecked[i] == false && existingAssets[i] < limit){
				System.out.println("Unsafe banks: "+ i);
				for(int row=0;row<borrowers.length;row++){
					if(borrowers[row][i] != '\u0000'){
						borrowers[row][i] = 0;
					}
				}
				isChecked[i] = true;//�������ȫ�������Ѿ���������֪
				i = -1;
				j = 0;
				
				for(int n=0;n<original.length;n++){
					existingAssets[n] = original[n];
				}
			}
			else{
				if(isChecked[i] == true){
					System.out.println("The bank "+i+" is unsafe.");
				}
				else
					System.out.println("The bank "+i+" is temporarily safe.");
				
			}
				
		}
		
		
	}

	/**
	 * ��ӡ���м�Ľ���ϵ.
	 * ÿһ�еĵ�һ�����������е����ڶ������ֱ����Ӹ����н������еĸ�������������������ֹ��ɵ����ԡ�
	 * ÿ�����ֵĵ�һ�������ǽ���id���ڶ��������������Ǯ����
	 * @param originalAssets
	 * @param numberOfBank
	 * @param borrowers
	 */
	public static void bankingRelationships(int[] originalAssets, int[] numberOfBank, double[][] borrowers) {
		
		for(int i=0;i<borrowers.length;i++){
			System.out.print(originalAssets[i]+"  "+numberOfBank[i]);
			for(int j=0;j<borrowers[i].length;j++){
				if(borrowers[i][j] != '\u0000'){
					System.out.print(" ("+j+" "+borrowers[i][j]+")");
				}
			}
			System.out.println();
		}
	}

	/**
	 * ����5�����зֱ�������ٸ�����
	 * @param borrowers
	 * @param numberOfBank
	 */
	public static void numberOfBank(double[][] borrowers, int[] numberOfBank) {
		
		for(int i=0;i<borrowers.length;i++){
			int count = 0;
			for(int j=0;j<borrowers[i].length;j++){
				if(borrowers[i][j] != '\u0000'){
					count++;
				}
			}
			numberOfBank[i] = count;
		}
	}

	/**
	 * ��ʼ��borrowers[i][j],��������i���������j�Ĵ����.
	 * ��ʼ��originalAssets[i]������5�����е�ԭʼ�ʲ�.
	 * @param borrowers
	 * @param originalAssets
	 * @throws FileNotFoundException
	 */
	public static void initializeData(double[][] borrowers, int[] originalAssets) throws FileNotFoundException {

		File file = new File("file/exercise7_17.txt");
		Scanner input = new Scanner(file);
		
		for(int i=0;i<borrowers.length;i++){
			for(int j=0;j<borrowers[i].length;j++){
				borrowers[i][j] = input.nextDouble();
			}	
		}
		
		for(int k=0;k<originalAssets.length;k++){
			originalAssets[k] = input.nextInt();
		}
	}

}
