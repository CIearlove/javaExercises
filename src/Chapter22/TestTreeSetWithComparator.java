package Chapter22;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javaExample.Circle;
import javaExample.GeometricObject;
import javaExample.Rectangle;

public class TestTreeSetWithComparator {

	public static void main(String[] args) {
		
		//Create a tree set for geometric objects using a comparator
		Set<GeometricObject> set = new TreeSet<GeometricObject>(new GeometricObjectComparator());
		set.add(new Rectangle(4,5));
		set.add(new Circle(40));
		set.add(new Circle(40));
		set.add(new Rectangle(4,1));
		
		System.out.println("A sorted set of geometric objects");
		for(GeometricObject element :set){
			System.out.println("area = "+ element.getArea());
		}
	}
}
