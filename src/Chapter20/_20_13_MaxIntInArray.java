package Chapter20;

public class _20_13_MaxIntInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {9,8,7,6,5,4,3,2,1};
		System.out.print(maxInt(array));
	}
	
	public static int maxInt(int[] array){
		return maxInt(array,array.length-1);
	}
	
	public static int maxInt(int[] array,int high){
		if(high == 0)
			return array[0];
		else
			return Math.max(maxInt(array,high-1), array[high]);
	}
}
