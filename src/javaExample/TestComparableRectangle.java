package javaExample;

public class TestComparableRectangle{
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		System.out.println("  : "+rect.getArea());
		ComparableRectangle com_rect1 = new ComparableRectangle(4.0,4.0);
		System.out.println("  : "+com_rect1.getArea());
		ComparableRectangle com_rect2 = new ComparableRectangle(5.0,6.0);
		com_rect2.setColor("not white");
		System.out.println("  : "+com_rect2.getArea());
		System.out.println("  : "+com_rect1.compareTo(com_rect2));
		
		Object obj = Max.max(com_rect1, com_rect2);//实际上为ComparableRectangle类型
		System.out.println(obj);//实际用的是ComparableRectangle中的toString()
	}
}
