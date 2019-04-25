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
	     * ��ʼ���´�����String����ʹ������������ͬ���ַ����У�
	     * ���仰˵���´������ַ����ǲ����ַ����ĸ�����
	     * ������Ҫ��ȷ���ַ������������򲻱�ʹ�ô˹��캯����
	     * @param original һ���ַ���
	     */
	    public Mystring1(Mystring1 original) {
	        this.value = original.value;
	        this.hash = original.hash;
	    }
		/**
		 * ���ַ����鴴��һ���ַ���
		 * �����µ��ַ�����ʹ���ʾ��ǰ�������ַ���������е��ַ�����
		 * �����ַ���������ݣ������޸��ַ����鲻��Ӱ���´������ַ���
		 * @param chars �ַ�����
		 */
		public Mystring1(char[] chars){
			this.value = new char[chars.length];
			//System.arraycopy(chars, 0, this.value, 0, chars.length);
			for(int i=0;i<chars.length;i++){
				value[i] = chars[i];
			}
		}
		/**
		 * ����һ���µ�{@code String}�����а����ַ�����������������е��ַ���
		 * {@code offset}�������������һ���ַ���������{@code count}����ָ��������ĳ��ȡ�
		 * ���������ݱ�����; �����޸��ַ����鲻��Ӱ���´������ַ�����
		 * 
		 * @param value ��Ϊ�ַ���Դ������
		 * @param offset ��ʼƫ����
		 * @param count ����
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
		 * ��������ַ���ָ�������µ��ַ�
		 * @param index ����
		 * @return ָ�������µ��ַ�
		 */
		public char charAt(int index){
			return value[index];
		}
		
		/**
		 * �����ַ����ĳ���
		 * @return �ַ����ĳ���
		 */
		public int length(){
			return value.length;
		}
		
		/**
		 * ��ȡ�Ӵ�
		 * @param begin �Ӵ����ַ����е���ʼ����
		 * @param end �Ӵ����ַ����еĽ�����������������Ӧ��ֵ��������
		 * @return ָ���������Ӵ�
		 */
		public Mystring1 substring(int begin,int end){
			//System.arraycopy(this.value, begin, substring, 0, end-begin);
			int count = end - begin;//�Ӵ��ĳ���
			return new Mystring1(this.value,begin,count);
		}
		/**
		 * ��ȡ�Ӵ�
		 * @param begin �Ӵ����ַ����е���ʼ����
		 * @return ָ����ʼ�������Ӵ�
		 */
		public Mystring1 substring(int begin){
			int end = this.value.length;
			return substring(begin,end);
		}
		/**
		 * ���ؽ������ַ���ת��ΪСд֮������ַ�������
		 * @return Сд�����ַ���
		 */
		public Mystring1 toLowerCase(){
			
			char[] temp = new char[value.length];
			
			for(int i=0;i<value.length;i++){
				temp[i] = Character.toLowerCase(value[i]);
			}
			return new Mystring1(temp);
		}
		/**
		 * ���ؽ������ַ���ת��Ϊ��д֮������ַ�������
		 * @return ��д�����ַ���
		 */
		public Mystring1 toUpperCase(){
			
			char[] temp = new char[value.length];
			
			for(int i=0;i<value.length;i++){
				temp[i] = Character.toUpperCase(value[i]);
			}
			return new Mystring1(temp);
		}
		/**
		 * �ж��ַ����Ƿ�ȼ�
		 * 1.������ַ��������õ��ڲ����ַ��������ã��ַ����ȼ�
		 * 2.�ַ������Ӧ�ַ���ȣ��ַ����ȼ�
		 * @param s ���Ƚϵ��ַ���
		 * @return �ȼ۷���true,���ȼ۷���false
		 */
		public boolean equals(Mystring1 s){
			
			//������ͬ
			if(this.value == s.value)
				return true;
			int n = this.value.length;
			//�����ַ����ĳ�����ͬ
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
		 * ��intֵ���ַ�������
		 * ���磺11111->"11111"
		 * @param i ����ֵ
		 * @return ������ֵ���ַ�����ʾ
		 */
		public static Mystring1 valueOf(int i){
			//int�͵��������ֵΪ2^32�η���ֵΪ��2147483648�����Ϊ10λ����
			char[] temp = new char[10];
		    int size = 0;
		    while (i != 0) {
		      //ȡ��λ����ֵ
		      int number = i % 10;
		      //ȡ�Ǹ�λ����ֵ
		      i = i / 10;
		      temp[size] = (char) (number + '0');
		      size++;
		    }

		    char[] temp2 = new char[size];
		    //��temp�����ֵ����
		    for (int k = size - 1; k >= 0; k--) {
		    	temp2[size-1-k] = temp[k];
		    }

		    return new Mystring1(temp2);
		}
		/**
		 * ��booleanֵ���ַ�������
		 * @param b ����ֵ
		 * @return �ò���ֵ���ַ�����ʾ
		 */
		public static String valueOf(boolean b){
			return b ? "true" : "false";
		}
		/**
		 * �����ַ�����
		 * @return
		 */
		public char[] toChars(){
			return value;
		}
		/**
		 * �����{@code String}�����ֵ�˳�����ڲ����ַ���֮ǰ������Ϊ��������
		 * �����{@code String}�����ֵ�˳�����ڲ����ַ���֮������Ϊ��������
		 * �����{@code String}����ȼ��ڲ����ַ���������Ϊ0.
		 * 
		 * �������ֵ�����Ķ��壺
		 * 
		 * ���������һ����������λ�þ��в�ͬ���ַ�������<i> k </i>��Ϊ��С������;
		 * Ȼ����λ��<i> k </i>���ַ����н�Сֵ���ַ��������ֵ�˳��������һ���ַ���֮ǰ��
		 * ����������£�{@code compareTo}���������ַ�����λ��{@code k}�������ַ�ֵ�Ĳ��� - ��ֵ��
		 * <blockquote><pre>
         * this.charAt(k)-anotherString.charAt(k)
         * </pre></blockquote>
         * 
         * ������Ƕ�Ӧ����λ�õ��ַ�����ͬ����ô�϶̵��ַ������ֵ�˳�����ڽϳ����ַ���֮ǰ��
         * ����������£�{@ code compareTo}�����ַ������ȵĲ��� - ��ֵ��
         * <blockquote><pre>
         * this.length()-anotherString.length()
         * </pre></blockquote>
         * 
		 * @param o �����ַ���
		 * @return ��������ַ������ڸ��ַ�������ֵΪ{@code 0};
		 * 		         ������ַ������ֵ�˳��С���ַ�����������ֵС��{@code 0};
		 * 		         ������ַ������ֵ�˳������ַ�����������ֵ����{@code 0}��
		 */
		@Override
		public int compareTo(Mystring1 anotherString) {
			
			int len1 = value.length;
	        int len2 = anotherString.value.length;
	        int lim = Math.min(len1, len2);
	        char v1[] = value;
	        char v2[] = anotherString.value;

	        int k = 0;
	        //���ַ����Ͳ����ַ���ǰlim���ַ����бȽ�
	        while (k < lim) {
	            char c1 = v1[k];
	            char c2 = v2[k];
	            if (c1 != c2) {
	                return c1 - c2;
	            }
	            k++;
	        }
	        //�ַ����Ͳ����ַ���ǰlim���ַ���ͬ
	        return len1 - len2;
		}
	}
}
