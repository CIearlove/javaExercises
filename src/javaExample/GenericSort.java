package javaExample;

public class GenericSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {new Integer(2),new Integer(4),new Integer(3)};
		Double[] doubleArray = {new Double(3.4),new Double(1.3),new Double(-22.1)};
		Character[] charArray = {new Character('a'),new Character('J'),new Character('r')};
		String[] stringArray = {"Tom","John","Fred"};
		
		sort(stringArray);
		printList(stringArray);
		
	}
	
	public static void sort(Comparable[] list){
		
		Comparable temp;
		int minIndex;
		
		for(int i=0;i<list.length;i++){
			minIndex = i;
			
			for(int j=i+1;j<list.length;j++){
				if(list[minIndex].compareTo(list[j]) > 0){//如果最小值比当前值大
					minIndex = j;
				}
			}
			/*
			 * 对象之间使用等号传引用不是传值
			 */
			temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;
		}
	}
	
	public static void printList(Object[] list){
		for(int i=0;i<list.length;i++){
			System.out.print(list[i]+" ");
		}
	}
}
