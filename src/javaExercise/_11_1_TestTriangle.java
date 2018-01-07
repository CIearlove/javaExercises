package javaExercise;

public class _11_1_TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle = null;
		try {
			triangle = new Triangle(1,1.5,3,"yellow",true);
		} catch (IllegalTriangleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Perimeter: "+triangle.getPerimeter());
		System.out.println(triangle.toString());
		System.out.println("Color: "+triangle.getColor());
		System.out.println("Filled? : "+triangle.isFilled());
	}

}
