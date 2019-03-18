package Chapter27;

public class City implements Displayable{
	private String cityName;
	private int x,y;
	
	public City(String cityName,int x,int y){
		this.cityName = cityName;
		this.x = x;
		this.y = y;
	}

	public String getCityName() {
		return cityName;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String getName() {
		return getCityName();
	}
}
