package Chapter06;
import java.util.Scanner;

public class Exercise6_3 {
	
	public static final int TOTALAMOUNT = 15;
	
	public static void main(String[] args) {
		
		
		int[] arrayInt = new int[TOTALAMOUNT];//This array will store distinct values.
		int[] allInt = new int[TOTALAMOUNT];//This array will store all values.
		int[] occurances = new int[TOTALAMOUNT];//This array will store the number of occurances.
		int numberOfDistinctValues = 0;
		int numberOfValues = 0;
		
		System.out.println("Enter the integers between 1 and 100:");
		
//Raw data
		initializeTheArray(allInt);
		numberOfValues = getNumberOfValues(allInt);
		
//Enter data into a distincted_value array
		getDistinctedValueArray(arrayInt,allInt,numberOfValues);
		numberOfDistinctValues = getNumberOfDistinctValues(arrayInt);
		
//Calculate the number of occurrences
		getNumberOfOccurances(occurances,allInt,arrayInt,numberOfDistinctValues,numberOfValues);
//Display output
		displayOutout(arrayInt,occurances,numberOfDistinctValues);
	}
	
	public static void initializeTheArray(int allInt[]){
		
		Scanner input  = new Scanner(System.in);
		for(int i=0;i<allInt.length;i++){
			allInt[i] = input.nextInt();
			if(allInt[i] == 0)
				break;
		}
	}
	
	public static int getNumberOfValues(int[] allInt){
		int numberOfValues = 0;
		for(int i=0;i<allInt.length;i++){
			if(allInt[i]>0)
				numberOfValues++;
		}
		return numberOfValues;
	}
	
	public static void getDistinctedValueArray(int[] arrayInt,int[] allInt,int numberOfValues){
		
		int numberOfDistinctValues = 0;
		for(int i=0;i<numberOfValues;i++){
			
			int value = allInt[i];
			//Step 1: Check if value is in numbers
			boolean isInArray = false;
			for(int j=0;j<numberOfDistinctValues;j++){
				if(value == arrayInt[j])
					isInArray = true;
			}
			
			//Step 2: If value is not in numbers, add it into numbers
			if(isInArray == false){
				arrayInt[numberOfDistinctValues] = value;
				//Step 3: Increment numberOfDistinctValues
				numberOfDistinctValues++;
			}
		}
	}
	
	public static int getNumberOfDistinctValues(int[] arrayInt){
		int numberOfDistinctValues = 0;
		for(int i=0;i<arrayInt.length;i++){
			if(arrayInt[i]>0)
				numberOfDistinctValues++;
		}
		return numberOfDistinctValues;
	}
	
	public static void getNumberOfOccurances(int[] occurances,int[] allInt,int[] arrayInt,
			int numberOfDistinctValues,int numberOfValues){
		
		for(int i=0;i<numberOfDistinctValues;i++){
			for(int j=0;j<numberOfValues;j++){
				if(arrayInt[i] == allInt[j])
					occurances[i]++;
			}
		}
	}
	
	public static void displayOutout(int[] arrayInt,int[] occurances,int numberOfDistinctValues){
		for(int i=0;i<numberOfDistinctValues;i++){
			if(occurances[i] > 1)
				System.out.println(arrayInt[i]+" occurs "+occurances[i]+" times. ");
			else
				System.out.println(arrayInt[i]+" occurs "+occurances[i]+" time. ");
		}
	}
}
