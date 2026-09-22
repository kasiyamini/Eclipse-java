package CIET;

public class Array2 {
	public static void main(String[] args) {
		int[] a = {10,20,30};
		int[] b = a.clone();
		b[0] = 300;
		System.out.println(a[0]);
		System.out.println(b[0]);
	}

}
// clone() = method