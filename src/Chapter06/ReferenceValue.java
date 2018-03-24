package Chapter06;

import Chapter14.Circle;

public class ReferenceValue {

	public static void main(String[] args) {
		
		Circle circle = new Circle(1.0);
		
		changeValue(circle);
	}

	public static void changeValue(Circle circle) {
		System.out.println("Before changed:\n"+circle.toString());
		circle.setRadius(5.0);
		System.out.println("After changed:\n"+circle.toString());
	}

}
