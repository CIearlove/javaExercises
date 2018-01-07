package javaExampleBefore;
public class TestCircle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Number of Objects:"+Circle3.getNumberOfObjects());
		
		Circle3 circle1 = new Circle3();
		System.out.println("Number of Objects:"+Circle3.getNumberOfObjects());
		System.out.println("Radius:"+circle1.getRadius());
		System.out.println("Area:"+circle1.getArea());
		
		Circle3 circle2 = new Circle3(5);
		System.out.println("Number of Objects:"+Circle3.getNumberOfObjects());
		System.out.println("Radius:"+circle2.getRadius());
		System.out.println("Area:"+circle2.getArea());
		
		circle1.setRadius(10);
		System.out.println("After reset,the radius of circle1:"+circle1.getRadius());
		System.out.println("Area:"+circle1.getArea());	
		
		Circle3 circle3 = new Circle3(15.0);
		printCircle(circle3);
		
		Circle3 circle4 = new Circle3(1.0);
		int n = 5;
		printAreas(circle4,n);
	}
	
	public static void printCircle(Circle3 circle){
		System.out.println("Number of Objects:"+Circle3.getNumberOfObjects());
		System.out.println("Radius:"+circle.getRadius());
		System.out.println("Area:"+circle.getArea());
	}
	
	public static void printAreas(Circle3 c,int times){
		System.out.println("Radius:\t\tArea:");
		while(times>=1){
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()+1.0);
			times--;
		}
	}
	

}
