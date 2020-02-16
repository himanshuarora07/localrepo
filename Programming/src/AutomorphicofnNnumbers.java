import java.util.Scanner;

public class AutomorphicofnNnumbers {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int count=0;
		int i=1;
		System.out.println("Enter the number");
		int num= scan.nextInt();
		int temp=num;
		int sq= num*num;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
		
		while(count!=0)
		{
			 i= i*10;
			 count--;
		}
		sq=sq%i;
		
		if(sq==temp)
		{
			System.out.println(temp+" is Automorphic number");
		}
		else{
			System.out.println(temp+" is not Automorphic number");
		}
	}

}
