package HW;

import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 2, 0, 0, 1, 2, 2, 1};
		int[] arr1 = { 1, 0, 2, 1, 0, 2, 1, 2, 0, 1};
		
		int[] s = sortNumber(arr);
		int[] s1 = sortNumber(arr1);
		
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(s1));
		
	}
	
	public static int[] sortNumber(int[] arr) {
		
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		int temp;
		
		while (mid <= high) {
			
			switch (arr[mid]) {
			case 0:
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;

			case 1:
				mid++;
				break;
				
				
			case 2:
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
				break;
				
			}
		}
		return arr;
	}
}
