package Chapter09;

public class Exercise9_23 {
	
	public static void main(String[] args){
		char[] chars = {
				'A','B','C','d','e'
		};
		
		char[] chars1 = {
				'A','B','C','d','e'
		};
		
		Mystring1 string1 = new Mystring1(chars);
		System.out.print("原数组: ");
		System.out.println(string1.toChars());
		System.out.println("数组下标为0时的字符： "+string1.charAt(0));
		System.out.println("数组的长度："+string1.length());
		
		Mystring1 substring1  = string1.substring(0,3);
		System.out.print("子串： ");
		System.out.println(substring1.toChars());
		Mystring1 lowerCase = string1.toLowerCase();
		System.out.print("将数组中的字符均变为小写字符：");
		System.out.println(lowerCase.toChars());
		
		Mystring1 string2 = new Mystring1(chars1);
		if(string1.equals(string2)){
			System.out.println("The same.");
		}
		else
			System.out.println("Not the same.");
		
		Mystring1 valueOfString = Mystring1.valueOf(1000);
		System.out.print("原数组: ");
		System.out.println(valueOfString.toChars());
	}
	
	
}
