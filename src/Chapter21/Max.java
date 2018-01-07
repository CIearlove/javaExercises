package Chapter21;

public class Max {
	public static Object max(Comparable o1,Comparable o2){
		if(o1.compareTo(o2) > 0){
			return o1;//返回的是实际类型，即ComparableRectangle类
		}
		else
			return o2;
	}
}
