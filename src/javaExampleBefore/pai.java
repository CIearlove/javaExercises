package javaExampleBefore;
import java.util.Scanner;
public class pai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
        double a,b = 0;
		for(int i=0; i<number; i++){
			if(i%2 == 1){
				a = -1.0/(2*i+1);
			}else
				a = 1.0/(2*i+1);
			b = a+b;
}
		System.out.println(4*b);
	}

}
