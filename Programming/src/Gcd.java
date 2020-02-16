
public class Gcd {
	
public static void main(String[] args) {
	
	int a =6;
	int b =4;
	int c=2;
	int small=0;
	//int grt =0;
	int gcd =0;
	if(a<b && a<c)
	{
		System.out.println("smallest number is "+ a);
		small=a;
		if(b>c)
		{
		//grt=b;
		}
		else
		{
			//grt=c;
		}
	}
	
	else if(b<c)
	{
		System.out.println("smallest number is "+ b);
		small=b;
		if(a>c)
		{
		//grt= a;
		}
		else{
			//grt=b;
		}
	}
	
	else
	{
		System.out.println("smallest number is "+ c);
		small=c;
		
	}
	
	
	for (int i = 1; i <=small; i++) {
		
		if(a % i==0 && b % i==0 && c % i==0 )
		{
			gcd =i;
			
		}
		
	}
	System.out.println("Gcd of three numbers is "+gcd);
}
}
