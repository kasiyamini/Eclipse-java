package CIET;

public class Parameters {
	int dog(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Parameters p = new Parameters();
		int a = p.dog(10,20);
		System.out.println(a);
		
	}

}
