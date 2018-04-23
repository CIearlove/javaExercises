package Chapter09;

public class Mystring1 {
	
	/** The value is used for character storage. */
    private char value[];
   
	/**
	 * ���ַ����鴴��һ���ַ���
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
	 * ��������ַ���ָ���±��µ��ַ�
	 * @param index
	 * @return
	 */
	public char charAt(int index){
		return value[index];
	}
	
	/**
	 * �����ַ����ĳ���
	 * @return
	 */
	public int length(){
		return value.length;
	}
	
	/**
	 * ��ȡ�Ӵ�
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
	 * ���ؽ������ַ���ת��ΪСд֮������ַ�������
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
	 * �ж������ַ����Ƿ���ͬ
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
			System.out.println("�����ַ������Ȳ�ͬ��");
			return false;
		}
			
	}
	
	/**
	 * ��intֵ���ַ�������
	 * @param i
	 * @return
	 */
	public static Mystring1 valueOf(int i){
		
		 char[] temp = new char[40];
		    int size = 0;
		    while (i != 0) {
		    //ȡ��λ����ֵ
		      int number = i % 10;
		    //ȡ�Ǹ�λ����ֵ
		      i = i / 10;
		      temp[size] = (char)(number + '0');
		      size++;
		    }

		    char[] temp2 = new char[size];
		    //��temp�����ֵ����
		    for (int k = size - 1; k >= 0; k--) {
		      temp2[k] = temp[size - k - 1];
		    }

		    return new Mystring1(temp2);
	}
	
	/**
	 * �����ַ�����
	 * @return
	 */
	public char[] toChars(){
		return value;
	}
}
