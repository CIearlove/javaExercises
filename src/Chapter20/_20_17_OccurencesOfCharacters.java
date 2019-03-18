package Chapter20;

public class _20_17_OccurencesOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(count("Welcome".toCharArray(),'e'));
	}

	public static int count(char[] chars,char ch){
		return count(chars,ch,chars.length-1);
	}
	public static int count(char[] chars,char ch,int high){
		int result = 0;
		if(high == 0)
			return chars[high] == ch?1:0;
		else{
			result = (chars[high] == ch?1:0)+count(chars,ch,high-1);
		}
		return result;
	}
}
