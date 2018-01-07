package javaExample;

import java.util.Date;

public abstract class GeometricObject {
	
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	protected GeometricObject(){
		this.dateCreated = new Date();
	}
	
	protected GeometricObject(String color,boolean filled){
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String toString(){
		return " created on:"+getDateCreated()+"\n color:"+getColor()+"\n filled:"+isFilled();
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
}
