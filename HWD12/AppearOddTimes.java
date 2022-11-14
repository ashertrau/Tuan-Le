package HW;

public class AppearOddTimes {
	public static void main(String[] args) {

		int arr[] = { 1, 1, 4, 3, 2, 4, 3, 2, 5, 5, 3 };

		int num = numberAppearOddTimes(arr);

		System.out.print(num);

	}

	public static int numberAppearOddTimes(int[] numbers) {

		int[] countAppearance = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			countAppearance[numbers[i]] = countAppearance[numbers[i]] + 1;
		}

		for (int i = 0; i < countAppearance.length; i++) {
			if (countAppearance[i] % 2 == 1) {
				return i;
			}
		}
		return -1;
	}
}