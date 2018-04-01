package Chapter07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_4 {

	public static void main(String[] args) throws FileNotFoundException {
		
		int employeeAndWorkingHour[][] = new int[8][7];
		int weeklyHours[] = new int[8];
		int[] indexList = new int[employeeAndWorkingHour.length];
		
		initialWorklyHour(employeeAndWorkingHour);
		
		computeWorklyHour(employeeAndWorkingHour,weeklyHours);
		
		// Sort weeklyHours
	    sortAndKeepIndex(weeklyHours, indexList);
	    
		printWorklyHour(weeklyHours,indexList);
	}

	public static void computeWorklyHour(int[][] employeeAndWorkingHour, int[] weeklyHours) {
		for (int i = 0; i < employeeAndWorkingHour.length; i++)
		      for (int j = 0; j < employeeAndWorkingHour[i].length; j++)
		        weeklyHours[i] += employeeAndWorkingHour[i][j];
	}

	public static void sortAndKeepIndex(int[] list, int[] indexList) {
		
		// Initialize indexList
	    for (int i = 0; i < indexList.length; i++)
	      indexList[i] = i;
	    
		for(int i=0;i<list.length-1;i++){
			
			int currentMax = list[i];
			int currentMaxIndex = i;
			
			for(int j=i+1;j<list.length;j++){
				if(currentMax < list[j]){
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
			
			if(currentMaxIndex != i){
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
				
				// Swap the index in indexList too
		        int temp = indexList[i];
		        indexList[i] = indexList[currentMaxIndex];
		        indexList[currentMaxIndex] = temp;
			}
		}
	}

	public static void printWorklyHour(int[] weeklyHours,int[] indexList) {
		for(int i = 0;i<weeklyHours.length;i++ ){
			System.out.println("Employee_"+indexList[i]+"'s weeklyHour:"+weeklyHours[i]);
		}
	}

	public static void initialWorklyHour(int[][] list) throws FileNotFoundException {
		
		File file = new File("file/WorkingHour.txt");
		Scanner input = new Scanner(file);
		
		for(int i=0;i<list.length;i++){
			for(int j=0;j<list[i].length;j++){
				list[i][j] = input.nextInt();
			}	
		}
	}

}
