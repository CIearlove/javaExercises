/*
 * ��n�����ݵ������У��ӵ�һ��Ԫ�ؿ�ʼ�����ȡ����������Ԫ����֮���������ν���n�ν��������ɵõ�һ��������е�������
 */
package algorithm;

public class Exercise12_7_Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cards = new int[54];
		for(int i=0;i<54;i++){
			cards[i] = i+1;
		}
		shuffle(cards);
	}
	
	public static void shuffle(int[] array){
		int temp;
		for(int i=0;i<array.length;i++){
			int randomIndex = (int)(Math.random()*array.length);
			temp = array[i];
			array[i] = array[randomIndex];
			array[randomIndex] = temp;
		}
	}
}
