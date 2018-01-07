package javaExample;

public class BoundedTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(2,2);
		Circle c1 = new Circle(2);
		
		System.out.println("Same area? "+BoundedTypeDemo.equalArea(r1, c1));
	}
	
	public static <E extends GeometricObject> boolean equalArea(E object1,E object2){
		return object1.getArea() == object2.getArea();
	}
}
