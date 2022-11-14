package HW;

public class FindSquareInteger {
	public static void main(String[] args) {
		
		int lowerRange = 1;
		int upperRange = 25;
		
		System.out.println("Square integer between " + lowerRange + " & " + upperRange + " : ");
		
		for (int i = lowerRange; i <= upperRange; i++) {
			
			int sqrt = (int)Math.sqrt(i);
			
			if (sqrt * sqrt == i) {
				System.out.print(i + " ");
			}
		}
    }
}