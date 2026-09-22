package CIET;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int marks = sc.nextInt();
		if(marks >= 90) {
			System.out.println("Grade A");
		}
		else if(marks >=100) {
			System.out.println("Grade B");
		}
		else {
			System.out.println("default");
		}
		
	}

}
