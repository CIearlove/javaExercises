package Chapter20;

public class _20_9_ReverseOutputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseDisplay("abcd");
	}

	//Recursive mode
	public static void reverseDisplay(String value){
		if(value.length() == 1)
			System.out.print(value);
		else{
			System.out.print(value.charAt(value.length()-1));
			reverseDisplay(value.substring(0, value.length()-1));
		}
	}
}
