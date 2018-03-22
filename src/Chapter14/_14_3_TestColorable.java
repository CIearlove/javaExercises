package Chapter14;

public class _14_3_TestColorable {

	public static void main(String[] args) {
		
		GeometricObject[] geometricObjects = new  GeometricObject[5];
		geometricObjects[0] = new Circle(1);
		geometricObjects[1] = new Circle(2);
		geometricObjects[2] = new Rectangle(1,2);
		geometricObjects[3] = new Rectangle(1,3);
		geometricObjects[4] = new Square(5);
		
		for(int i=0;i<geometricObjects.length;i++){
			if(geometricObjects[i] instanceof Colorable){
			System.out.println(geometricObjects[i].toString());
			}
		}
	}

}
