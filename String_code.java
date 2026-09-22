package CIET;

public class String_code {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("welcome");
		
		char[] letter = {'j', 'a', 'v', 'a'};
		String s3 = new String(letter);
		
		byte[] data = {65,66,67};
		String s4 = new String(data);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
