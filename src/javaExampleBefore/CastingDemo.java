package javaExampleBefore;
public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object1 = new Circle(10,"Red",false);
		Object object2 = new Rectangle(10,5,"Blue",true);
		Object object3 = new Circle(10,"Yellow",true);
		/*
		displayObject(object1);
		displayObject(object2);
		
		displayObject2((GeometricObject)object1);
		*/
		System.out.println("The radius of"+" object1" +" is same with" +" object3"+":"
		+((Circle)object1).equals(object3));
	}
	
	public static void displayObject(Object object){
		if(object instanceof Circle){
			System.out.println("The circle area is: "+((Circle)object).getArea());
		}
		else if(object instanceof Rectangle){
			System.out.println("The rectangle area is: "+((Rectangle)object).getArea());
		}
	}

	public static void displayObject2(GeometricObject object){
		System.out.println("The circle color is: "+object.getColor());
	}
	
	
}
