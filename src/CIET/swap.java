package CIET;
import java.util.Scanner;


class swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>90) {
			System.out.println("grade a");
			
		}
		else if ( a > 70 && a < 90) {
			System.out.println("grade b");
		}
		else {
			System.out.println("fail");
		}
		
	}

}
