package CIET;

import java.util.Arrays;

public class String2 {
	public static void main(String[] args) {
		int numbers[] = {10,20,30,40,50};
		System.out.println("arrays before sorting");
		System.out.println(Arrays.toString(numbers));
		System.out.println("arrays after sorting");
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
	}

}
