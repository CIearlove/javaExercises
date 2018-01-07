package javaExampleBefore;
public class TV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		System.out.println("tv1'channel is "+tv1.channel+" and volume level is "+tv1.volumeLevel);
		
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();;
		tv2.volumeUp();;
		System.out.println("tv2'channel is "+tv2.channel+" and volume level is "+tv2.volumeLevel);
	}
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	
	public TV(){
		
	}
	public void turnOn(){
		on = true;
	}
	
	public void turnOff(){
		on = false;
	}
	
	public void setChannel(int newChannel){
		if(on && newChannel>=1 && newChannel<=120){
			channel = newChannel;
		}
	}
	
	public void setVolume(int newVolume){
		if(on && newVolume>=1 && newVolume<=7){
			volumeLevel = newVolume;
		}
	}
	
	public void channelUp(){
		if(on && channel<120){
			channel++;
		}
	}
	
	public void channelDown(){
		if(on && channel>1){
			channel--;
		}
	}
	
	public void volumeUp(){
		if(on && volumeLevel<7){
			volumeLevel++;
		}
	}
	
	public void volumeDown(){
		if(on && volumeLevel>1){
			volumeLevel--;
		}
	}
}
