package javaExampleBefore;
public class Circle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 circle1 = new Circle2(10);
		System.out.println("The area of the circle of radius"+circle1.radius+" is "+circle1.getArea());
	}
	
	 double radius;
		Circle2(){
			radius = 1.0;
		}
		Circle2(double newRadius){
			radius = newRadius;
		}
		
		double getArea(){
			return radius*radius*Math.PI;
		}

}
