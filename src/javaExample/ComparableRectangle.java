package javaExample;

public class ComparableRectangle extends Rectangle implements Comparable{
	
	public ComparableRectangle(double width,double height){
		super(width,height);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(getArea() > ((ComparableRectangle)o).getArea()){
			return 1;
		}
		else if(getArea() < ((ComparableRectangle)o).getArea()){
			return -1;
		}
		else
			return 0;
	}
	
	public String toString(){
		return " created on:"+getDateCreated()+"\n color:"+getColor()+"\n filled:"+isFilled()+"\n width:"+
				getWidth()+"\n height:"+getHeight()+"\n ComparableRectangle";
	}
}
