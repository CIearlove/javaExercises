package javaExampleBefore;
public class TotalArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle3[] circleArray;
		circleArray = createCircleArray();
		printCircleArray(circleArray);
	}
	
	public static Circle3[] createCircleArray(){
		Circle3[] circleArray = new Circle3[10];
		for(int i=0;i<circleArray.length;i++){
			circleArray[i] = new Circle3(Math.random()*10);
		}
		return circleArray;
	}
	
	public static void printCircleArray(Circle3[] circleArray){
		System.out.println("Radius\t\t\t\tArea");
		for(int i=0;i<circleArray.length;i++){
			System.out.println(circleArray[i].getRadius()+"\t\t"+circleArray[i].getArea());
		}
		System.out.println("Total Area:"+sum(circleArray));
	}
	
	public static double sum(Circle3[] circleArray){
		double sum = 0;
		for(int i=0;i<circleArray.length;i++){
			sum+=circleArray[i].getArea();
		}
		return sum;
	}

}
