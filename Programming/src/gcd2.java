import java.util.Scanner;

public class gcd2 {
	public static void main(String[] args) {
		System.out.println("Enter first number");
		Scanner scan= new Scanner(System.in) ;
		int num1 = scan.nextInt();
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		int small=0;
		int gcd=0;
		
		if(num1<num2)
		{
			small=num1;
		}
		else
		{
			small=num2;
		}
		for (int i = 1; i < small; i++) {
			
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
			}
			
		}
		System.out.println("GCD of two numbers is "+ gcd);
	}
	

}
