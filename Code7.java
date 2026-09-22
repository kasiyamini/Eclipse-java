package CIET;
import java.util.Scanner;
public class Code7 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number");
	int a = sc.nextInt();
	System.out.println("Enter the 2nd number");
	int b = sc.nextInt();
	int temp = a;
	a = b;
	b = temp;
	System.out.println("After Swap: " + a);
	System.out.println("After Swaping: " + b);
	sc.close();
	
	}

}
