package algorithm;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testlist = {5,4,3,2,1};
		selectionSort(testlist);
		for(int i=0; i<5; i++){
			System.out.print(testlist[i]);
			System.out.print(" ");
		}
	}
	
	public static void selectionSort(int[] list){
		
		int minIndex;
		int temp;
		for(int i=0;i<list.length;i++){
			minIndex = i;
			//����������������һ����С��Ԫ�أ����õ����±�minIndex
			for(int j=i+1;j<list.length;j++){
				if(list[minIndex] > list[j]){
					minIndex = j;
				}
			}
			
			temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;
		}
	}
}
