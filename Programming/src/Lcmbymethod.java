import java.util.Scanner;

public class Lcmbymethod {
	
	static int lcm(int num1,int num2)
	{ boolean flag=true;
//	Scanner scan=new Scanner(System.in);
//	System.out.println("Enter the first number");
//	int num1=scan.nextInt();
//	System.out.println("Enter the second number");
//	int num2=scan.nextInt();
	
	int large=0;
	
	if(num1>num2)
	{
		large=num1;
	}
	else
	{
		large=num2;
	}
	
	
	

while(flag==true)
 {
	if(large%num1==0&& large%num2==0)
	{
		System.out.println("LcM of two numbers is "+large);
		flag=false;
		return large;// By writing there is no need to write after while loop
		
	}
	
	large++;


 }
return large;
	}
	
	public static void main(String[] args) {
		
//		Lcmbymethod lbm=new Lcmbymethod();
//		lbm.lcmmeth();
		
		int lcm=lcm(0,0);
		
	}
}
