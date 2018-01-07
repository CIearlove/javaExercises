package javaExampleBefore;
import java.util.Scanner;
public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.1415926;
		Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for radius:");
        double radius = input.nextDouble();
        System.out.println("Area:"+PI*radius*radius);
	}

}
