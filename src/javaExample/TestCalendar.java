package javaExample;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��õ�ǰʱ����Ϣ
		Calendar calendar = new GregorianCalendar();//����
		System.out.println("Current time is "+new Date());
		System.out.println("YEAR:\t"+calendar.get(Calendar.YEAR));
		System.out.println("MONTH:\t"+calendar.get(Calendar.MONTH));
		System.out.println("DATE:\t"+calendar.get(Calendar.DATE));
		System.out.println("HOUR:\t"+calendar.get(Calendar.HOUR));
		System.out.println("AM_PM:\t"+calendar.get(Calendar.AM_PM));
		//���ָ�����ڵ���Ϣ
		Calendar calendar1 = new GregorianCalendar(2017,9,12);
		int a1 = calendar1.get(Calendar.DAY_OF_WEEK);
		int a2 = calendar1.get(Calendar.DAY_OF_MONTH);
		int a3 = calendar1.get(Calendar.DAY_OF_YEAR);
	}
}
