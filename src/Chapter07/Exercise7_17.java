package Chapter07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise7_17 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//银行i贷款给银行j的贷款额
		double borrowers[][] = new double[5][5];
		//这5个银行的原始资产
		int originalAssets[] = new int[5];
		
		initializeData(borrowers,originalAssets);
		
		//这5个银行分别借款给多少个银行
		int numberOfBank[] = new int[5];
		numberOfBank(borrowers,numberOfBank);
		
		bankingRelationships(originalAssets,numberOfBank,borrowers);
		
		//表示要保持银行安全的最小总资产
		int limit = 201;
		unsafeBanks(borrowers,originalAssets,limit);
	}

	/**
	 * 举个例子。
	 * 银行3的总资产是75+125，这个数字是在limit之下的。所以，银行3是不安全的。
	 * 银行3变得不安全之后，银行1的总资产也降为125+40.所以，银行1也不安全。
	 * @param borrowers
	 * @param originalAssets
	 * @param limit
	 */
	public static void unsafeBanks(double[][] borrowers, int[] existingAssets, int limit) {
		
		int original[] = new int[5];
		
		for(int m=0;m<original.length;m++){
			original[m] = existingAssets[m];
		}
	
		//表示这个银行是否是不安全的
		boolean isChecked[] = new boolean[5];
		
		int i;
		int j;
		//计算银行的现有有效资产
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
				isChecked[i] = true;//这个不安全的银行已经被程序所知
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
	 * 打印银行间的借款关系.
	 * 每一行的第一个数字是银行的余额，第二个数字表明从该银行借款的银行的个数，其余的是两个数字构成的数对。
	 * 每对数字的第一个数就是借款方的id，第二个数就是所借的钱数。
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
	 * 计算5个银行分别借款给多少个银行
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
	 * 初始化borrowers[i][j],表明银行i贷款给银行j的贷款额.
	 * 初始化originalAssets[i]，表明5个银行的原始资产.
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
