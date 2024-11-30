package practise;

public class Prime {

	public static void main(String[] args) {

		int num = 12;

		int count = 0;

		if (num > 1) {

			for (int i = 2; i <= num; i++) {

				if (num % 2 == 0) {
					count++;

				}
			}

			if (count == 2) {
				System.out.println("it is prime");

			}

			else {

				System.out.println("it is not prime");
			}
		}

	}

}
