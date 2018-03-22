package Chapter14;
import java.util.Date;

public abstract class GeometricObject implements Comparable{
	
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	public GeometricObject(){
		this.dateCreated = new Date();
	}
	
	public GeometricObject(String color,boolean filled){
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
		return "created on:"+dateCreated+"\n color:"+color+"\n and filled:"+filled;
	}

	public static Comparable max(Comparable o1,Comparable o2){
		if(o1.compareTo(o2) > 0)
			return o1;
		else
			return o2;
	}
	
    public abstract double getArea();
	
	public abstract double getPerimeter();
}
