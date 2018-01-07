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
			//从无序序列中挑出一个最小的元素，并得到其下标minIndex
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
