package Chapter14;

public class Rectangle extends GeometricObject{
	
	private double width=1;
	private double height=1;
	
	public Rectangle(){
		
	}
	
    public Rectangle(double w,double h){
		width = w;
		height = h;	
	}
    
    public double getWidth(){
    	return width;
    }
    
    public double getHeight(){
    	return height;
    }
    
    public double getArea(){
    	return width*height;
    }
    
    public double getPerimeter(){
    	return (width+height)*2;
    }
    
    public String toString(){
		return " created on:"+getDateCreated()+"\n color:"+getColor()+"\n filled:"+isFilled()+"\n width:"+
				getWidth()+"\n height:"+getHeight();
	}

	@Override
	public int compareTo(Object o) {
		if(getArea() > ((Rectangle)o).getArea()){
			return 1;
		}
		else if(getArea() > ((Rectangle)o).getArea()){
			return 0;
		}
		else
			return -1;
	}

}
