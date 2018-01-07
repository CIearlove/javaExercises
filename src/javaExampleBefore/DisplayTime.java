package javaExampleBefore;
import java.util.Scanner;
public class DisplayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer for seconds: ");
		int time = input.nextInt();
		int minutes = time/60;
		int seconds = time%60;
		System.out.println("Minutes: "+minutes+" Seconds:"+seconds);
	}

}
