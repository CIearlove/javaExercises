package javaExampleBefore;
public class ShowCurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long  totalMilliseconds = System.currentTimeMillis();
		long  totalSeconds = totalMilliseconds/100;
		long  currentSeconds = (int)totalSeconds%60;
		long  totalMinutes = (int)totalSeconds/60;
		long  currentMinutes = totalMinutes%60;
		long  totalHours = totalMinutes/60;
		long  currentHours = totalHours%24;
		
		System.out.println(currentHours+":"+currentMinutes+":"+currentSeconds);
	}

}
