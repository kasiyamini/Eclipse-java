package CIET;

public class Method3 {
	double ciet(int a, int b, double c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Method3 m = new Method3();
		double a = m.ciet(10,20,100.00);
		System.out.println(a);
	}

}
