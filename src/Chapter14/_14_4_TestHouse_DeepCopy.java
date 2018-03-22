//I have not finished it.
package Chapter14;

public class _14_4_TestHouse_DeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		House house1 = new House(1,100);
		House house2 = (House)house1.clone();
		House house3 = (House)house1.Deepclone();
		
		System.out.println("house1: \n"+house1.toString());
		System.out.println("house2: \n"+house2.toString());
		System.out.println("house3: \n"+house3.toString());
		
		if(house1.getId() == house2.getId())
			System.out.println("House1's id equal to House2's id.");
		if(house1.getWhenBuilt() == house2.getWhenBuilt())
			System.out.println("House1's building time equal to House2's building time.");
		if(house1 == house2)
			System.out.println("Deep Copy.");
		else
			System.out.println("But shallow Copy.");
		
		if(house1.getId() == house3.getId())
			System.out.println("House1's id equal to House3's id.");
		if(house1.getWhenBuilt() == house3.getWhenBuilt())
			System.out.println("House1's building time equal to House3's building time.");
		if(house1 == house3)
			System.out.println("Deep Copy.");
		else
			System.out.println("But shallow Copy.");
		
		System.out.println("House1 equal to House2? "+house1.equals(house2));
		System.out.println("House1 equal to House3? "+house1.equals(house3));
		
	}

}
