package practise;

public class ReverseNumber {

	public static void main(String[] args) {

		int a = 1234456;
		int mem = 0;

		int digit = 0;

		while (a > 0) {

			int rev = a % 10;

			

			digit = mem * 10 + rev;

			a = a / 10;

			//System.out.print(digit);

		}

		

	}

}
