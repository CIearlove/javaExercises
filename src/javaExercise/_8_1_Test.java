package javaExercise;

public class _8_1_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_8_1_Rectangle rectangle1 = new _8_1_Rectangle(4,40);
		System.out.println("Width:"+rectangle1.getWidth()+"\nHeight:"+rectangle1.getHeight()+
				"\nArea:"+rectangle1.getArea()+"\nPerimeter:"+rectangle1.getPerimeter());
		
		_8_1_Rectangle rectangle2 = new _8_1_Rectangle(3.5,35.9);
		System.out.println("Width:"+rectangle2.getWidth()+"\nHeight:"+rectangle2.getHeight()+
				"\nArea:"+rectangle2.getArea()+"\nPerimeter:"+rectangle2.getPerimeter());
	}

}
