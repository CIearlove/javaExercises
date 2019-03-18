package Chapter20;

public class _20_16_NumberOfUppercaseLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The number of uppercase letters: "+count("WELCome".toCharArray()));
	}
	
	public static int count(char[] chars){
		return count(chars,chars.length-1);
	}
	
	public static int count(char[] chars,int high){
		int highTh = 0;
		if(high == 0)
			return Character.isUpperCase(chars[high]) ? 1:0;
		else
			highTh = Character.isUpperCase(chars[high]) ? 1:0;
			return count(chars,high-1) + highTh;
	}
}
