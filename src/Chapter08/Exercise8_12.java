package Chapter08;

import java.util.Scanner;

public class Exercise8_12 {

	public static void main(String[] args) {
		
		//x_1,y_1,x_2,y_2
		double point1[] = new double[4];
		double point2[] = new double[4];
		//a,b,e
		double threeParameter1[] = new double[3];
		//c,d,f
		double threeParameter2[] = new double[3];
		
		System.out.println("Enter the endpoints of the first line segment:");
		Scanner input = new Scanner(System.in);
		for(int i=0;i<point1.length;i++){
			point1[i] = input.nextDouble();
		}
		getParameter(threeParameter1,point1);
		
		System.out.println("Enter the endpoints of the second line segment:");
		for(int j=0;j<point1.length;j++){
			point2[j] = input.nextDouble();
		}
		getParameter(threeParameter2,point2);
		
		LinearEquation my = new LinearEquation(threeParameter1[0],threeParameter1[1],
				threeParameter2[0],threeParameter2[1],
				threeParameter1[2],threeParameter2[2]);
		System.out.println("The intersecting point is:");
		System.out.println("X:"+my.getX()+"\nY:"+my.getY());
	}

	public static void getParameter(double[] threeParameter, double[] point) {
		
		double k = (point[3]-point[1])/(point[2]-point[0]);
		threeParameter[0] = k;
		threeParameter[1] = -1;
		threeParameter[2] = k*point[0] - point[1];
	}

}
