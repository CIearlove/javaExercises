package Chapter20;

public class _20_18_TowerOfHanoi {

	public static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The moves are: ");
		moveDisks(5,'A','B','C');
		System.out.println("Count: "+count);
	}
	public static void moveDisks(int n,char fromTower,char toTower,char auxTower){
		if(n==1){
			System.out.println("Move disk "+n+" from "+fromTower+" to "+toTower);
			count++;
		}
		else{
			moveDisks(n-1,fromTower,auxTower,toTower);
			System.out.println("Move disk "+n+" from "+fromTower+" to "+toTower);
			count++;
			moveDisks(n-1,auxTower,toTower,fromTower);
		}
	}
}
