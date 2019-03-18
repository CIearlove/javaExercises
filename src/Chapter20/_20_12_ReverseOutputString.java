package Chapter20;

public class _20_12_ReverseOutputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseDisplay("12345");
	}

	public static void reverseDisplay(String value){
		reverseDisplay(value,value.length()-1);
	}
	
	public static void reverseDisplay(String value,int high){
		if(high < 0)
			System.out.print("Valid index.");
		else if(high == 0)
			System.out.print(value.charAt(high));
		else{
			System.out.print(value.charAt(high));
			reverseDisplay(value,high-1);
		}
	}
}
