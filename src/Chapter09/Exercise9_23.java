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
		System.out.print("ԭ����: ");
		System.out.println(string1.toChars());
		System.out.println("�����±�Ϊ0ʱ���ַ��� "+string1.charAt(0));
		System.out.println("����ĳ��ȣ�"+string1.length());
		
		Mystring1 substring1  = string1.substring(0,3);
		System.out.print("�Ӵ��� ");
		System.out.println(substring1.toChars());
		Mystring1 lowerCase = string1.toLowerCase();
		System.out.print("�������е��ַ�����ΪСд�ַ���");
		System.out.println(lowerCase.toChars());
		
		Mystring1 string2 = new Mystring1(chars1);
		if(string1.equals(string2)){
			System.out.println("The same.");
		}
		else
			System.out.println("Not the same.");
		
		Mystring1 valueOfString = Mystring1.valueOf(1000);
		System.out.print("ԭ����: ");
		System.out.println(valueOfString.toChars());
	}
	
	
}
