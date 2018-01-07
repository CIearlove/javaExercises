package javaExercise;

public class _8_1_Rectangle {
	
	private double width=1;
	private double height=1;
	
	public _8_1_Rectangle(){
		
	}
	
    public _8_1_Rectangle(double w,double h){
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
}
