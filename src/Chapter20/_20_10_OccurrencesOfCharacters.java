package Chapter20;

public class _20_10_OccurrencesOfCharacters {

	//这题我没做出来
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(count("Welcome",'e'));
	}

	public static int count(String str,char a){
		int result = 0;
		if(str.length() == 0)
			return 0;
		else{
			result = ((str.charAt(0) == a)?1:0)+count(str.substring(1),a);
		}
		return result;
	}
}
