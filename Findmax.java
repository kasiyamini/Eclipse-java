package CIET;

public class Findmax {
	static int findMax(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		return max;
	}
	public static void main(String[] args) {
		int[] a = {56, 87, 34, 400};
		System.out.println(findMax(a));
		
	}

}
