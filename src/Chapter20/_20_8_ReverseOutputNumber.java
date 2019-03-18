package Chapter20;

public class _20_8_ReverseOutputNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverseDisplay(12345);
		reverseDisplayR(12345);
	}

	//Cyclic mode
	public static void reverseDisplay(int value){
		StringBuffer valueString = new StringBuffer(""+value);
		for(int i=0;i<valueString.length();i++){
			System.out.print(valueString.charAt(valueString.length()-1-i));
		}
	}
	
	//Recursive mode
	public static void reverseDisplayR(int value){
		if(value/10 == 0)
			System.out.print(value);
		else
		{
			System.out.print(value%10);
			reverseDisplayR(value/10);
		}
	}
}
