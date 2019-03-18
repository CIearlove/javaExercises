package Chapter20;

public class _20_15_OccurencesOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(count("Welcomeee",'e'));
	}
	
	public static int count(String str,char a){
		return count(str,a,str.length()-1);
	}
	public static int count(String str,char a,int high){
		int result = 0;
		if(high == 0)
			return str.charAt(high) == a?1:0;
		else{
			result = ((str.charAt(high) == a)?1:0)+count(str.substring(0,high),a);
		}
		return result;
	}
}
