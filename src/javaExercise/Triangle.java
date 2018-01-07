package javaExercise;

public class Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(){
	}
	
	public Triangle(double side1,double side2,double side3,String color,boolean filled)
	   throws IllegalTriangleException{
		
		super(color,filled);
		if(side1+side2<=side3 || side1+side3<=side2 || side2+side3<=side1){
			throw  new IllegalTriangleException("The sum of any two sides is greater than the other side");
		}
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public double getPerimeter(){
		return side1+side2+side3;
	}
	
	public String toString(){
		return "Triangle: side1 = "+side1+" side2 = "+side2+" side3 = "+side3;
	}
}

    class IllegalTriangleException extends Exception{
    	
    	public IllegalTriangleException(){

    	}
    	
    	public IllegalTriangleException(String s){
    		super(s);
    	}
}
