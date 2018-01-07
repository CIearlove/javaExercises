package javaExampleBefore;
public class TestGeometricObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject geoObject1 = new Circle(5);//ʵ������ΪCircle
		GeometricObject geoObject2 = new Rectangle(5,3);//ʵ������ΪRectangle
		
		displayGeometricObject(geoObject1);
		displayGeometricObject(geoObject2);
	}
	
	public static boolean equalArea(GeometricObject object1,GeometricObject object2){
		return (object1.getArea()== object2.getArea());
	}
	
	public static void displayGeometricObject(GeometricObject object){
		System.out.println("The area is: "+object.getArea());
		System.out.println("The perimeter is: "+object.getPerimeter());
	}
}
