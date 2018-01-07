package javaExercise;
import java.util.Scanner;
public class _8_11_TestLinearEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,d,e,f;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter six integer:");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		
		LinearEquation le = new LinearEquation(a,b,c,d,e,f);
		if(le.isSolvable()){
			System.out.println("X:"+le.getX()+" Y:"+le.getY());
		}
	}

}
