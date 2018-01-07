/*
 * 有n个数据的数据列，从第一个元素开始，随机取出数据列中元素与之交换，依次进行n次交换，即可得到一个随机排列的数据列
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
