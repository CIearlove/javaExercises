package Chapter14;

public class _14_2_TestCircle {

	public static void main(String[] args) {
		
		GeometricObject circle1 = new Circle(2);
		GeometricObject circle2 = new Circle(3);
		
		GeometricObject maxCircle = (GeometricObject) GeometricObject.max(circle1, circle2);
		System.out.println("Larger circle : \n"+maxCircle.toString());
	}

}
