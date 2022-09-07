package question2;

public class primeNumber {

	// TODO Auto-generated method stub
	static void printDivisors(int n) {

		if (n < 2 || n > 100) {
			System.out.print("invalid number");

		} else {

			for (int i = 1; i <= 100; i++) {

				if (n % i == 0)
					System.out.print(i + " ");

			}
		}

	}

	// Driver method
	public static void main(String[] args) {
		System.out.println("The divisors of number are: ");
		printDivisors(100);

	}

}
