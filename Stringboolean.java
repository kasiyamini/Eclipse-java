package CIET;
import java.util.Scanner;

public class Stringboolean {
	public static void main(String[] args) {
		String a = "java c python";
		boolean b = a.contains("java");
		boolean c = a.startsWith("python");
		boolean d = a.endsWith("python");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
