package Chapter14;

public class Square extends GeometricObject implements Colorable{
	
	private double sideLength = 0.0;
	
	public Square(){
	}
	
	public Square(double s){
		sideLength = s;
	}
	
	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public int compareTo(Object o) {
		if(getArea()>((Square)o).getArea())
			return 1;
		else if(getArea()==((Square)o).getArea())
			return 0;
		else
			return -1;
	}

	@Override
	public void howToColor() {
		System.out.println("Color all four sides.");
	}

	@Override
	public double getArea() {
		return sideLength*sideLength;
	}

	@Override
	public double getPerimeter() {
		return 4*sideLength;
	}
	
	public String toString(){
		return " created on:"+getDateCreated()+"\n color:"+getColor()+"\n filled:"+isFilled()+"\n sideLength:"+
				getSideLength();
	}
}
