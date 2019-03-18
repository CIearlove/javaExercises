package Chapter20;

public class _20_14_NumberOfUppercaseLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The number of uppercase letters: "+count("WELcome"));
	}
	
	public static int count(String letter){
		return count(letter,letter.length()-1);
	}
	
	public static int count(String letter,int high){
		int highTh = 0;
		if(high == 0)
			return Character.isUpperCase(letter.charAt(high)) ? 1:0;
		else
			highTh = Character.isUpperCase(letter.charAt(high)) ? 1:0;
			return count(letter,high-1) + highTh;
	}
}
