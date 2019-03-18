package Chapter20;

public class _20_21_DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decimalToBinary(32));
		System.out.println(decimalToBinary(33));
		System.out.println(decimalToBinary(34));
	}
	public static String decimalToBinary(int value) {
	    if (value == 0)
	      return "";
	    else
	      return decimalToBinary(value / 2) + value % 2;   
	  }
	
}
