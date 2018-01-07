package Chapter20;

public class RecursivePalindrome {
	public static boolean isPalindrome(String s){
		return isPalindrome(s,0,s.length()-1);
	}
	public static boolean isPalindrome(String s, int low, int high) {
		if(low>=high){
			return true;
		}
		else if(s.charAt(low)!=s.charAt(high)){
			return false;
		}
		else
			return isPalindrome(s,low+1,high-1);
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("dd11"));
	}

}
