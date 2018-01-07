package javaExample;

public class TestClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		House house1  = new House(1,140.50);
		House house2 = (House) house1.clone();
		System.out.println(" house1 id: "+house1.getId()+" area: "+house1.getArea()+" whenBuilt: "+house1.getWhenBuilt());
		
		System.out.println(" house2 id: "+house2.getId()+" area: "+house2.getArea()+" whenBuilt: "+house2.getWhenBuilt());
		
	}

}
