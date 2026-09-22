package CIET;

public class Method_Overloading2 {
	static double calculateArea(double side) {
		return side * side;	
	}
	static double caalculateArea(double length, double width) {
		return length * width;
	}
	static double calculateArea(double radius, boolean isCircle) {
		return Math.PI * radius * radius;
	}
	public static void main(String[] args) {
		System.out.println(calculateArea(12));
		System.out.println(calculateArea(5 * 4));
		System.out.println(calculateArea(3));
	}

}
