package CIET;

public class Min_max {
	public static void main(String[] args) {
		int[] arr = {5,6,7,9,4};
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
				
			}
		}
		System.out.println("maximum " + max);
		System.out.println("minimum " + min);
	}

}
