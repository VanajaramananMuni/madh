package practise;

public class Fibo {

	
	public static void main(String[] args) {
		//Marvelous man
		int number  =10;
		
		int num1 =0 , num2=1;
		
		System.out.print(num1+ ""+ num2);
		
		for(int i=2; i<number; i++) {
			
		int num3=	num1 + num2;
		
		System.out.print(num3);
		num1= num2;
		num2=num3;
			
			
		}
		
		
	}
	
	
	
	
	
}
