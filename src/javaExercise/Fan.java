package javaExercise;

public class Fan {

	public final int SLOW = 1;
	public final int MEDIUM = 2;
	public final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
    public Fan(){
	}
    
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	public String toString(){
		if(on){
			return "Speed:"+speed+"\n"+"Color:"+color+"\n"+"Radius:"+radius+"\n";
		}
		else
		{
			return "Color:"+color+"\n"+"Radius:"+radius+"\n"+"fan is off";
		}
	}
	
	
}
