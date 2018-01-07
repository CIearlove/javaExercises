package javaExampleBefore;
public class Circle3 {
	private double radius;
	private static int numberOfObjects;
	
	public Circle3(){
		numberOfObjects++;
	}
	
	public Circle3(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double newRadius){
		radius = (newRadius>=0)?newRadius:1;
	}
	
	public static int getNumberOfObjects(){
		return numberOfObjects;
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}
}
