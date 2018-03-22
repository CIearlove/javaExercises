package Chapter14;

public class _14_9_FindTheMaxObject {
	
	public static void main(String[] args) {
		
		String[] string = {"a","b","c","d","e"};
		House[] house = new House[5];
		house[0] = new House(1,100);
		house[1] = new House(2,200);
		house[2] = new House(3,300);
		house[3] = new House(4,400);
		house[4] = new House(5,500);
		
		String maxString = (String) max(string);
		House maxHouse = (House) max(house);
		
		System.out.println("maxString: \n"+ maxString.toString());
		System.out.println("maxHouse: \n"+ maxHouse.toString());
	}
	
	public static Object max(Comparable[] a){
		
		Comparable maxObject = a[0];
		
		for(int i=1;i<a.length;i++){
			if(maxObject.compareTo(a[i]) < 0){
				maxObject = a[i];
			}
		}
		return maxObject;
	}
}
