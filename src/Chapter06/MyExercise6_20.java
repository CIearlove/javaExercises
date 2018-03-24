package Chapter06;

public class MyExercise6_20 {

	public static void main(String[] args) {
		
		int[] queens = new int[8];
		int count = 0;
		
		for(int i=0;i<8;i++)
			queens[i] = -1;
		
		queens[0] = 0;
		int k = 1;
		
		while(k>=0 && k<=7){
			int j = findPosition(k,queens);
			count++;
			if(j>0){
				queens[k] = j;
				k++;
			}
			else{
				queens[k] = -1;
			    k--;
			}	
		}
		printArray(queens,count);
	}

	
	public static int findPosition(int k, int[] queens){
		
		int start = (queens[k] == -1) ? 0 : queens[k]+1;
		
		for(int j=start;j<8;j++){
			if(isValid(k,j,queens) == true){
				return j;
			}
		}
		return -1;
	}

	public static boolean isValid(int k, int j, int[] queens) {
		
		for(int i=0;i<k;i++){
			if(queens[i] == j)
				return false;
		}
		
		for(int row = k,col = j; row >= 0 && col >= 0; row--,col--){
			if(queens[row] == col)
				return false;
		}
		
		for(int row = k,col = j; row >= 0 && col <= 7; row--,col++){
			if(queens[row] == col)
				return false;
		}
		
		return true;
	}
	
	public static void printArray(int[] queens,int count) {
		System.out.println("Number of runs: "+count);
		for(int i=0;i<queens.length;i++){
			System.out.println("("+i+","+queens[i]+")");
		}
		
		for(int j=0;j<queens.length;j++){
			for(int k=0;k<queens[j];k++){
				System.out.print("| ");
			}
			System.out.print("|Q| ");
			for(int l=queens[j]+1;l<queens.length;l++){
				System.out.print("| ");
			}
			System.out.println();
		}
	}

}
