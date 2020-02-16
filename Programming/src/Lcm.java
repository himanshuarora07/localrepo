import java.util.Scanner;

public class Lcm {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=scan.nextInt();
		System.out.println("Enter the second number");
		int num2=scan.nextInt();
		
		int large=0;
		
		if(num1>num2)
		{
			large=num1;
		}
		else
		{
			large=num2;
		}
		
		boolean flag=true;
		
		
			while(flag==true)
			{
				
				
				if(large%num1==0&& large%num2==0)
				{
					System.out.println("LcM of two numbers is "+large);
					flag=false;
					
				}
				
				large++;
			}
				
			
		}
	 
		
		
	}


