package javaExercise;
import java.util.Date;

public class _8_3_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		m1(date);
	}
	
	public static void m1(Date date){
		int time = 1000;
		for(int i=0;i<8;i++){
			date.setTime(time);
			System.out.println(date.toString());
			time=time*10;
		}
		
	}

}
