package javaExample;

import java.util.Date;

public class House implements Cloneable,Comparable{
	
	private int id;
	private double area;
	private java.util.Date whenBuilt;
	
	public House(int id,double area){
		this.id = id;
		this.area = area;
		whenBuilt = new java.util.Date();
	}
	
	
	public int getId() {
		return id;
	}


	public double getArea() {
		return area;
	}

	public java.util.Date getWhenBuilt() {
		return whenBuilt;
	}
	
	public Object clone() throws CloneNotSupportedException {
		
		House o = null;
		o = (House) super.clone();
		o.whenBuilt = (Date) o.whenBuilt.clone();
		
		return o;
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(getArea() > ((House)o).getArea()){
			return 1;
		}
		else if(getArea() < ((House)o).getArea()){
			return -1;
		}
		else
			return 0;
	}
}
