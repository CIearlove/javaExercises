package Chapter09;

public class Mystring1 {
	
	/** The value is used for character storage. */
    private char value[];
   
	/**
	 * 用字符数组创建一个字符串
	 * @param chars
	 */
	public Mystring1(char[] chars){
		this.value = new char[chars.length];
		System.arraycopy(chars, 0, this.value, 0, chars.length);
	}
	
	public char[] getValue() {
		return value;
	}
	
	/**
	 * 返回这个字符串指定下标下的字符
	 * @param index
	 * @return
	 */
	public char charAt(int index){
		return value[index];
	}
	
	/**
	 * 返回字符串的长度
	 * @return
	 */
	public int length(){
		return value.length;
	}
	
	/**
	 * 获取子串
	 * @param begin
	 * @param end
	 * @return
	 */
	public Mystring1 substring(int begin,int end){
		char[] substring = new char[end-begin];
		System.arraycopy(this.value, begin, substring, 0, end-begin);
		return new Mystring1(substring);
	}
	
	/**
	 * 返回将所有字符都转换为小写之后的新字符串对象
	 * @return
	 */
	public Mystring1 toLowerCase(){
		
		char[] temp = new char[value.length];
		
		for(int i=0;i<value.length;i++){
			temp[i] = Character.toLowerCase(value[i]);
		}
		return new Mystring1(temp);
	}
	
	/**
	 * 判断两个字符串是否相同
	 * @param s
	 * @return
	 */
	public boolean equals(Mystring1 s){
		
		char[] value1 = new char[value.length];
		char[] value2 = new char[s.length()];
		
		for(int i=0;i<value.length;i++){
			if(value1[i] != value2[i]){
				return false;
			}
		}
		
		if(value1.length == value2.length){
			return true;
		}
		else{
			System.out.println("两个字符串长度不同。");
			return false;
		}
			
	}
	
	/**
	 * 将int值用字符串表述
	 * @param i
	 * @return
	 */
	public static Mystring1 valueOf(int i){
		
		 char[] temp = new char[40];
		    int size = 0;
		    while (i != 0) {
		    //取个位数的值
		      int number = i % 10;
		    //取非个位数的值
		      i = i / 10;
		      temp[size] = (char)(number + '0');
		      size++;
		    }

		    char[] temp2 = new char[size];
		    //将temp数组的值到序
		    for (int k = size - 1; k >= 0; k--) {
		      temp2[k] = temp[size - k - 1];
		    }

		    return new Mystring1(temp2);
	}
	
	/**
	 * 返回字符数组
	 * @return
	 */
	public char[] toChars(){
		return value;
	}
}
