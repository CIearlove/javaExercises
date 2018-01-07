package mistakesInExercises;
public class Test2 {
	private int duozhu;
	public Test2(int value){
		duozhu = value;
	}
	
	public int getDuozhu() {
		return duozhu;
	}

	public void setDuozhu(int duozhu) {
		this.duozhu = duozhu;
	}
	
	public static void main(String[] args){
		int int1,int2;
		int1 = 2;
		int2 = 3;
		int[] int3 = {2},int4 = {3};
		Test2 duozhu1 = new Test2(2);
		Test2 duozhu2 = new Test2(3);
		change(int1,int2);
		change(int3,int4);
		change(duozhu1,duozhu2);
		System.out.println(int1+" "+int2);
		System.out.println(int3[0]+" "+int4[0]);
		System.out.println(duozhu1.getDuozhu()+" "+duozhu2.getDuozhu());
	}
		
	
	public static void change(Test2 duozhu1, Test2 duozhu2) {
		duozhu1.setDuozhu(3);
		duozhu2.setDuozhu(2);
	}

	

	public static void change(int i,int j){
		int temp;
		temp = i;
		i = j;
		j = temp;
	}
	
	public static void change(int[] int1,int[] int2){
		int temp;
		temp = int1[0];
		int1[0] = int2[0];
		int2[0] = temp;
	}
}


