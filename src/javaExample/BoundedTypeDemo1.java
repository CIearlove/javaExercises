package javaExample;


import javaExample.Circle;
import javaExample.GeometricObject;
import javaExample.Rectangle;

public class BoundedTypeDemo1 {
	public static  void main(String[] args) {
		Rectangle r1 = new Rectangle(2*Math.PI,2);
		Circle c1 = new Circle(2);
		
		System.out.println("Same area? "+equalArea(r1, c1));
	}
	
	public static boolean equalArea(GeometricObject object1,GeometricObject object2){
		return object1.getArea() == object2.getArea();
	}
}
