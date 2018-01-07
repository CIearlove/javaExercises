package javaExercise;
import java.util.Scanner;

public class _13_3_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int[] array = new int[100];
		int index;
		
		for(int i=0;i<100;i++){
			array[i] = (int) (Math.random()*100);
		}
		index  = input.nextInt();
		
		try{
			System.out.println("Number is: "+array[index]);
		}
		catch(Exception ex){
			System.out.println("Out of Bounds.");
		}
	}

}
