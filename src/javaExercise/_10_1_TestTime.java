package javaExercise;

public class _10_1_TestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time1 = new Time();
		System.out.println("Hour:"+time1.getHour()+"\nMinutes:"
		+time1.getMinute()+"\nSeconds:"+time1.getSecond());
		
		Time time2 = new Time(555550000);
		System.out.println("Hour:"+time2.getHour()+"\nMinutes:"
		+time2.getMinute()+"\nSeconds:"+time2.getSecond());
		
		
	}

}
