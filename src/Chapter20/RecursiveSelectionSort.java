package Chapter20;

public class RecursiveSelectionSort {
	public static void selectSort(double[] list){
		selectSort(list,0,list.length-1);
	}
	public static void selectSort(double[] list, int low, int high) {
		if(low<high){
			//Find the smallest number and its index in list(low..high)
			int indexOfMin = low;
			double min = list[low];
			
			for(int i=low+1;i<=high;i++){
				if(list[i]<min){
					indexOfMin = i;
					min = list[i];
				}
			}
			//Swap
			list[indexOfMin] = list[low];
			list[low] = min;
			//Sort the remaining list(low+1..high)
			selectSort(list,low+1,high);
		}
		
		
	}
	public static void main(String[] args) {
		double[] data = {9.1,8,7,6,5,4,3,2,1};
		selectSort(data);
		for(double sorteddata:data){
			System.out.print(sorteddata+" ");
		}
	}

}
