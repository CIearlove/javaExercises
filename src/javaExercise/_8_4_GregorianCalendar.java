package javaExercise;
import java.util.GregorianCalendar;
public class _8_4_GregorianCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		
		System.out.println("Year:"+gregorianCalendar.get(GregorianCalendar.YEAR)+
				"\nMonth:"+gregorianCalendar.get(GregorianCalendar.MONTH)+"\nDayofMonth:"+
				gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
		
		gregorianCalendar.setTimeInMillis(1234567898765L);
		System.out.println("Year:"+gregorianCalendar.get(GregorianCalendar.YEAR)+
				"\nMonth:"+gregorianCalendar.get(GregorianCalendar.MONTH)+"\nDayofMonth:"+
				gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
