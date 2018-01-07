package algorithm;
import java.util.Scanner;
import javaExercise.StackOfInteger;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an array of integer:");
		Scanner input = new Scanner(System.in);
		StackOfInteger stack  = new StackOfInteger();
		
		
		while(true){
			int integer  = input.nextInt();
			
			if(integer!=0){
				stack.push(integer);
			}
			else{
				break;
			}
		}
		
		int[] ascending = insertSort(stack.getElements());
		
		
		for(int i=0;i<ascending.length;i++){
			System.out.print(" "+ascending[i]);
		}
		
	}
	
	public static int[] insertSort(int[] array){
		int i,j;
		int temp;
		
		for(i=1;i<array.length;i++){
			temp = array[i];
			j=i-1;
			
			while(j>=0 && temp<array[j]){
				array[j+1] = array[j];
				--j;
			}
			
			array[j+1] = temp;
		}
		return array;
	}
}
