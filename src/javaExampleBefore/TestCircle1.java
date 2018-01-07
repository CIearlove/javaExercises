package javaExampleBefore;
public class TestCircle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The number of objects:"+Circle1.getNumberOfObjects());
		
		Circle1 circle1 = new Circle1();
		System.out.println("The area of the circle of radius"+circle1.radius+" is "+circle1.getArea());
		
		Circle1 circle2 = new Circle1(25);
		System.out.println("The area of the circle of radius"+circle2.radius+" is "+circle2.getArea());
		
		System.out.println("The number of objects:"+Circle1.getNumberOfObjects());
	}
}
	
	class Circle1{
		double radius;
		static int numberOfObjects;
		
		Circle1(){
			radius = 1.0;
			numberOfObjects++;
		}
		Circle1(double newRadius){
			radius = newRadius;
			numberOfObjects++;
		}
		
		double getArea(){
			return radius*radius*Math.PI;
		}
		
		static int getNumberOfObjects(){
			return numberOfObjects;
		}
	}


