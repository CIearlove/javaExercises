package javaExample;


public class Circle extends GeometricObject{
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public Circle(double radius,String color,boolean filled){
		
		super(color,filled);
		this.radius = radius;
		/*
		setColor(color);
		setFilled(filled);
		*/
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea(){
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter(){
		return 2*Math.PI*radius;
	}
	
	public double getDiameter(){
		return 2*radius;
	}
	
	public String printCircle(){
		return super.toString()+"\n and radius:"+radius;
	}
	
	public  boolean equals(Object object){
		if(object instanceof Circle){
			return radius == ((Circle)object).radius;
		}
		else
			return false;
	}
	
	public String toString(){
		return " created on:"+getDateCreated()+"\n color:"+getColor()+"\n filled:"+isFilled()+"\n radius:"+
				getRadius()+"\n Circle";
	}
}
