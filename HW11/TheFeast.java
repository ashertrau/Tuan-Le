package HW;

public class TheFeast {
	public static void main(String[] args) {

		int n = 15;
		int c = 3;
		int m = 2;
		
		int chocolates = n / c;
		
		int totalChocolate = 0;
        
        totalChocolate += chocolates;

        while(chocolates >= m) {
            totalChocolate += chocolates / m;
            chocolates = (chocolates / m) + (chocolates % m);
        }
        
        System.out.println("Total chocolate bar: " + totalChocolate);

	}
}

/*int money = 15;

int chocolatePrice = 3;

int numberOfWrappers = 2;

int chocolateBar = money / chocolatePrice;
*/