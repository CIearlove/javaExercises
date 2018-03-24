package Chapter14;
//111111
public class _14_1_TestGeometricObject {

	public static void main(String[] args) {
		
		GeometricObject circle1 = new Circle(5);
		GeometricObject circle2 = new Circle(6);
		
		GeometricObject rectangle1 = new Rectangle(5,5);
		GeometricObject rectangle2 = new Rectangle(5,6);
		
		GeometricObject maxCircle = (GeometricObject) GeometricObject.max(circle1, circle2);
		System.out.println("Larger circle : \n"+maxCircle.toString());
		
		GeometricObject maxRectangle = (GeometricObject) GeometricObject.max(rectangle1, rectangle2);
		System.out.println("Larger rectangle : \n"+maxRectangle.toString());
		
	}

}
