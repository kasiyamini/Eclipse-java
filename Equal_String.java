package CIET;

public class Equal_String {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		if(s1 == s2) {
			System.out.println("equals");
		}
		else {
			System.out.println("not equals");
		}
	}

}
