package javaExampleBefore;
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle(10);
		Circle circle2 = new Circle(100,"yellow",false);
		System.out.println(""+circle1.printCircle());
		System.out.println(""+circle2.printCircle());
		
		System.out.println("The area is:"+circle2.getArea());
		System.out.println("The perimeter is:"+circle2.getPerimeter());
		System.out.println("The diameter is:"+circle2.getDiameter());
	}

}
