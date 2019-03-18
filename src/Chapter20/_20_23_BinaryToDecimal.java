package Chapter20;

public class _20_23_BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("ĳһֵ��N�η���"+nthpower(16,2));
		System.out.println("������תʮ���ƣ�"+binaryToDecimal("1"));
		System.out.println("ʮ������תʮ���ƣ�"+hexToDecimal("1"));
	}
	
	public static int binaryToDecimal(String binaryString){
		int digitLength = binaryString.length();
		int baseNumber = 2;
		int digitValue = 0;
		
		if(binaryString.length() == 0)
			return 0;
		else{
			digitValue = binaryString.charAt(0) - '0';
			return (int) (digitValue*nthpower(baseNumber,digitLength-1) + binaryToDecimal(binaryString.substring(1)));
		}
	}
	
	public static int hexToDecimal(String hexString){
		int digitLength = hexString.length();
		int baseNumber = 16;
		int digitValue = 0;
		
		if(hexString.length() == 0)
			return 0;
		else if(hexString.charAt(0)>='A'){
			digitValue = hexString.charAt(0) - '7';
			return (int) (digitValue*nthpower(baseNumber,digitLength-1) + hexToDecimal(hexString.substring(1)));
		}
		else{
			digitValue = hexString.charAt(0) - '0';
			return (int) (digitValue*nthpower(baseNumber,digitLength-1) + hexToDecimal(hexString.substring(1)));
		}
	}
	
	/**
	 * ����ĳһֵ��n�η�
	 * @param basenumber ĳһֵ
	 * @param n �η���
	 * @return 
	 */
	public static long nthpower(int basenumber,int n){
		if(n == 0)
			return 1;
		else{
			return basenumber*nthpower(basenumber,n-1);
		}
	}
}
