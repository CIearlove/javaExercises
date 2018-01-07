package javaExercise;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PrintCalendar {
	static String output = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter full year(e.g.,2001):");
		int year = input.nextInt();
		
		System.out.println("Enter month as number between 1 and 12:");
		int month = input.nextInt();
		*/
		String yearString = JOptionPane.showInputDialog(null,"Enter full year (i.e. 2001):",
				 "Enter Year", JOptionPane.QUESTION_MESSAGE);
		int year = Integer.parseInt(yearString);
		
		String monthString = JOptionPane.showInputDialog(null,"Enter month in number between 1 and 12:",
				"Enter Month", JOptionPane.QUESTION_MESSAGE);
		int month = Integer.parseInt(monthString);
		
		printMonth(year,month);
		JOptionPane.showMessageDialog(null, output);
	}
	
	public static void printMonth(int year,int month){
		printMonthTitle(year,month);
		printMonthBody(year,month);
	}
	/*
    public static void printMonthTitle(int year,int month){
		System.out.println("         "+year+"     "+getMonthName(month));
		System.out.println("_________________________________");
		System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");
		
	}
    */
    static void printMonthTitle(int year, int month) {
        output += "         " + getMonthName(month)
          + ", " + year + "\n";
        output += "-----------------------------\n";
        output += " Sun Mon Tue Wed Thu Fri Sat\n";
      }
    
    static void printMonthBody(int year, int month) {
        // Pad space before the first day of the month
    	int startDay = getStartDay(year,month);
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year,month);
        int i = 0;
        for (i = 0; i < startDay; i++)
          output += "    ";

        for (i = 1; i <= numberOfDaysInMonth; i++) {
          if (i < 10)
            output += "     " + i;
          else
            output += "   " + i;

          if ((i + startDay) % 7 == 0)
            output += "\n";
        }

        output += "\n";
      }
    public static String getMonthName(int month){
    	String monthName = "";
    	switch(month){
    	case 1:monthName="january"; break;
    	case 2:monthName="February"; break;
    	case 3:monthName="March"; break;
    	case 4:monthName="April"; break;
    	case 5:monthName="May"; break;
    	case 6:monthName="June"; break;
    	case 7:monthName="July"; break;
    	case 8:monthName="August"; break;
    	case 9:monthName="September"; break;
    	case 10:monthName="October"; break;
    	case 11:monthName="November"; break;
    	case 12:monthName="December"; 
    	}
    	return monthName;
    }
    /*
    public static void printMonthBody(int year,int month){
    	
		int startDay = getStartDay(year,month);
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year,month);
		for(int i=0;i<startDay;i++){
			System.out.print("    ");
		}
		for(int i=1;i<=numberOfDaysInMonth;i++){
			System.out.printf("%5d",i);
			if((i+startDay)%7 == 0){
				System.out.println();
			}
			
		}
	}
    */
    public static int getStartDay(int year,int month){
    	final int START_DAY_FOR_JAN_1_1800 = 3;
    	int totalNumberOfDays = getTotalNumberOfDays(year,month);
    	
    	return (totalNumberOfDays+START_DAY_FOR_JAN_1_1800)%7;
    }
    
    public static int getTotalNumberOfDays(int year,int month){
    	
    	int total = 0;
    	for(int i=1800;i<year;i++){
    		if(isLeapYear(i)){
    			total=total+366;
    		}else
    		{
    			total=total+355;
    		}
    	}
    	for(int i=1;i<month;i++){
    		total = total + getNumberOfDaysInMonth(year,i);
    	}
    	
    	return total;
    	
    }
    
    public static int getNumberOfDaysInMonth(int year,int month){
    	if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
    		return 31;
    	}
    	else if(month==4||month==6||month==9||month==11){
    		return 30;
    	}
    	else
    		return isLeapYear(year)?29:28;
    		
    }
    
    public static boolean isLeapYear(int year){
    	if(year%400 == 0){
    		return true;
    	}
    	else if(year%4 == 0 && year%100 !=0){
    		return true;
    	}
    	else
    		return false;
    }

}