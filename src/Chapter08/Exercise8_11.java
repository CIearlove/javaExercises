package Chapter08;

public class Exercise8_11 {

	public static void main(String[] args) {
		
		LinearEquation my = new LinearEquation(1,2,3,4,5,6);
		if(my.isSolvable()){
			System.out.println("X:"+my.getX()+"\nY:"+my.getY());
		}
		else
			System.out.println("The equation has no solution.");
	}
}
