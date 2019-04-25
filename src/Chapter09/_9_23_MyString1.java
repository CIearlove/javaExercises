package Chapter09;

import java.util.Arrays;

public class _9_23_MyString1{
	
	public static void main(String[] args){
		char[] chars = {
				'A','B','C','d','e'
		};
		
		char[] chars1 = {
				'A','B','C','d','e','F','G','H'
		};
		
		Mystring1 str1 = new Mystring1(chars);
		Mystring1 str2 = new Mystring1(str1);
		
		if(str1 == str2)
			System.out.println("str1 == str2");
		else if(str1.equals(str2))
			System.out.println("str1.equals(str2)");
		
		Mystring1 str3 = new Mystring1(chars1,1,6);
		
		Mystring1 str4 = str3.toLowerCase();
		str4 = str4.toUpperCase();
		Mystring1 str5 = str1;
		
		if(str1.equals(str5))
			System.out.println("str1.equals(str5)");
		
		Mystring1 str6 = Mystring1.valueOf(10101010);
		
		Mystring1 str7 = str6.substring(1, 6);
		Mystring1 str8 = str6.substring(4);
		
		String str9 = Mystring1.valueOf(true);
	}
	
	static final class Mystring1 implements Comparable<Mystring1> {
		
		/** The value is used for character storage. */
	    private char value[];
	   
	    /** Cache the hash code for the string */
	    private int hash; // Default to 0
	    
	    /**
	     * 初始化新创建的String对象，使其代表与参数相同的字符序列；
	     * 换句话说，新创建的字符串是参数字符串的副本。
	     * 除非需要明确的字符串副本，否则不必使用此构造函数。
	     * @param original 一个字符串
	     */
	    public Mystring1(Mystring1 original) {
	        this.value = original.value;
	        this.hash = original.hash;
	    }
		/**
		 * 用字符数组创建一个字符串
		 * 分配新的字符串，使其表示当前包含在字符数组参数中的字符序列
		 * 复制字符数组的内容，后序修改字符数组不会影响新创建的字符串
		 * @param chars 字符数组
		 */
		public Mystring1(char[] chars){
			this.value = new char[chars.length];
			//System.arraycopy(chars, 0, this.value, 0, chars.length);
			for(int i=0;i<chars.length;i++){
				value[i] = chars[i];
			}
		}
		/**
		 * 分配一个新的{@code String}，其中包含字符数组参数的子数组中的字符。
		 * {@code offset}参数是子数组第一个字符的索引，{@code count}参数指定子数组的长度。
		 * 副本的内容被复制; 后续修改字符数组不会影响新创建的字符串。
		 * 
		 * @param value 作为字符来源的数组
		 * @param offset 初始偏移量
		 * @param count 长度
		 */
		public Mystring1(char value[], int offset, int count) {
			this.value = new char[count];
			for(int i=0;i<count;i++){
				this.value[i] = value[i+offset];
			}
	        //this.value = Arrays.copyOfRange(value, offset, offset+count);
	    }
		
		public char[] getValue() {
			return value;
		}
		
		/**
		 * 返回这个字符串指定索引下的字符
		 * @param index 索引
		 * @return 指定索引下的字符
		 */
		public char charAt(int index){
			return value[index];
		}
		
		/**
		 * 返回字符串的长度
		 * @return 字符串的长度
		 */
		public int length(){
			return value.length;
		}
		
		/**
		 * 获取子串
		 * @param begin 子串在字符串中的起始索引
		 * @param end 子串在字符串中的结束索引（该索引对应的值不包含）
		 * @return 指定索引的子串
		 */
		public Mystring1 substring(int begin,int end){
			//System.arraycopy(this.value, begin, substring, 0, end-begin);
			int count = end - begin;//子串的长度
			return new Mystring1(this.value,begin,count);
		}
		/**
		 * 获取子串
		 * @param begin 子串在字符串中的起始索引
		 * @return 指定开始索引的子串
		 */
		public Mystring1 substring(int begin){
			int end = this.value.length;
			return substring(begin,end);
		}
		/**
		 * 返回将所有字符都转换为小写之后的新字符串对象
		 * @return 小写的新字符串
		 */
		public Mystring1 toLowerCase(){
			
			char[] temp = new char[value.length];
			
			for(int i=0;i<value.length;i++){
				temp[i] = Character.toLowerCase(value[i]);
			}
			return new Mystring1(temp);
		}
		/**
		 * 返回将所有字符都转换为大写之后的新字符串对象
		 * @return 大写的新字符串
		 */
		public Mystring1 toUpperCase(){
			
			char[] temp = new char[value.length];
			
			for(int i=0;i<value.length;i++){
				temp[i] = Character.toUpperCase(value[i]);
			}
			return new Mystring1(temp);
		}
		/**
		 * 判断字符串是否等价
		 * 1.如果此字符串的引用等于参数字符串的引用，字符串等价
		 * 2.字符串间对应字符相等，字符串等价
		 * @param s 待比较的字符串
		 * @return 等价返回true,不等价返回false
		 */
		public boolean equals(Mystring1 s){
			
			//引用相同
			if(this.value == s.value)
				return true;
			int n = this.value.length;
			//两个字符串的长度相同
			if(n == s.length()){
				for(int i=0;i<n;i++){
					if(this.value[i]!=s.value[i])
						return false;
				}
				return true;
			}
			return false;
		}
		
		/**
		 * 将int值用字符串表述
		 * 例如：11111->"11111"
		 * @param i 整型值
		 * @return 该整型值的字符串表示
		 */
		public static Mystring1 valueOf(int i){
			//int型的整型最大值为2^32次方，值为：2147483648，最大为10位整数
			char[] temp = new char[10];
		    int size = 0;
		    while (i != 0) {
		      //取个位数的值
		      int number = i % 10;
		      //取非个位数的值
		      i = i / 10;
		      temp[size] = (char) (number + '0');
		      size++;
		    }

		    char[] temp2 = new char[size];
		    //将temp数组的值到序
		    for (int k = size - 1; k >= 0; k--) {
		    	temp2[size-1-k] = temp[k];
		    }

		    return new Mystring1(temp2);
		}
		/**
		 * 将boolean值用字符串表述
		 * @param b 布尔值
		 * @return 该布尔值的字符串表示
		 */
		public static String valueOf(boolean b){
			return b ? "true" : "false";
		}
		/**
		 * 返回字符数组
		 * @return
		 */
		public char[] toChars(){
			return value;
		}
		/**
		 * 如果此{@code String}对象按字典顺序排在参数字符串之前，则结果为负整数。
		 * 如果此{@code String}对象按字典顺序排在参数字符串之后，则结果为正整数。
		 * 如果此{@code String}对象等价于参数字符串，则结果为0.
		 * 
		 * 下面是字典排序的定义：
		 * 
		 * 如果他们在一个或多个索引位置具有不同的字符，则让<i> k </i>成为最小的索引;
		 * 然后，其位置<i> k </i>的字符具有较小值的字符串，按字典顺序排在另一个字符串之前。
		 * 在这种情况下，{@code compareTo}返回两个字符串中位置{@code k}处两个字符值的差异 - 即值：
		 * <blockquote><pre>
         * this.charAt(k)-anotherString.charAt(k)
         * </pre></blockquote>
         * 
         * 如果它们对应索引位置的字符均相同，那么较短的字符串按字典顺序排在较长的字符串之前。
         * 在这种情况下，{@ code compareTo}返回字符串长度的差异 - 即值：
         * <blockquote><pre>
         * this.length()-anotherString.length()
         * </pre></blockquote>
         * 
		 * @param o 参数字符串
		 * @return 如果参数字符串等于该字符串，则值为{@code 0};
		 * 		         如果此字符串按字典顺序小于字符串参数，则值小于{@code 0};
		 * 		         如果此字符串按字典顺序大于字符串参数，则值大于{@code 0}。
		 */
		@Override
		public int compareTo(Mystring1 anotherString) {
			
			int len1 = value.length;
	        int len2 = anotherString.value.length;
	        int lim = Math.min(len1, len2);
	        char v1[] = value;
	        char v2[] = anotherString.value;

	        int k = 0;
	        //将字符串和参数字符串前lim个字符进行比较
	        while (k < lim) {
	            char c1 = v1[k];
	            char c2 = v2[k];
	            if (c1 != c2) {
	                return c1 - c2;
	            }
	            k++;
	        }
	        //字符串和参数字符串前lim个字符相同
	        return len1 - len2;
		}
	}
}
