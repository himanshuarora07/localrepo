
public class Prime {
	
	public static void main(String[] args) {
		
	int a= 3;
	
	
	for (int i = 2; i < a; i++) {
		
		int s=a%i;
	 
		if(s==0)
		{
			System.out.println("Number is not prime ");
		}
		else
		{
			System.out.println("Number is prime");
		}
	}
	}

}
