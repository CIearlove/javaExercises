package javaExercise;
import java.util.Random;
public class _8_4_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(1000);
		for(int i=0;i<50;i++){
			System.out.println(""+random.nextInt(100));
		}
	}

}
