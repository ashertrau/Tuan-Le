package HW;

import java.util.Arrays;

public class LongestSameString {
	public static void main(String[] args) {
	
		String[] str1 = { "flower", "flow", "flight" };
		String[] str2 = { "dog", "racecar", "car" };
		String[] str3 = { "apple", "ape", "apply" };
		
		String S1 = prefix(str1);
		String S2 = prefix(str2);
		String S3 = prefix(str3);
		
		System.out.println(Arrays.toString(str1) + " -> prefix is: " + S1);
		System.out.println(Arrays.toString(str2) + " -> prefix is: " + S2);
		System.out.println(Arrays.toString(str3) + " -> prefix is: " + S3);
		
	}	 
	
	
	public static String prefix(String[] str) {
		if (str.length == 0) { // 1 step
			return ""; // 1 step
		}
		
		String prefix = str[0]; // 1 step
		
		for (int i = 0; i < str.length; i++) {
			while (str[i].indexOf(prefix) != 0) { // n step
				prefix = prefix.substring(0, prefix.length() - 1); // 1 step
			}
		}
		
		return prefix; // 1 step
		
		// 0(n + 5) -> 0(n) - Linear Time
	}
}
