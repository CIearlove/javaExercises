package Chapter20;

public class _20_25_StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayPermuation("bcd");
	}
	
	public static void displayPermuation(String s){
		displayPermuation("",s);
	}
	
	public static void displayPermuation(String s1, String s2) {
	    if (s2.length() > 0) {
	      for (int i = 0; i < s2.length(); i++) {
	        displayPermuation(s1 + s2.charAt(i),s2.substring(0, i) + s2.substring(i + 1));
	      }
	    }
	    else
	      System.out.println(s1);
	  }
}
