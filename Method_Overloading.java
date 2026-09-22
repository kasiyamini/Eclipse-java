package CIET;

public class Method_Overloading {
	void add(int a) {
		System.out.println(a);
	}
	void add(double a) {
		System.out.println(a);
	}
	void add(int b, double c) {
		System.out.println(b+c);
	}
	void add(int b, int c) {
		System.out.println(b+c);
	}
	public static void main(String[] args) {
		Method_Overloading m = new Method_Overloading();
		m.add(12);
		m.add(34.0);
		m.add(12,56.9);
		m.add(23,56);
		System.out.println();
	}

}
