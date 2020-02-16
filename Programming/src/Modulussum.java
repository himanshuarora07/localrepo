
public class Modulussum {
	public static void main(String[] args) {
		
		
		int n=2578;
		int sum=0;
		int mod;
		int count=0;
		
		while(n>0)
		{
			count=count +1;
			mod=n%10;
			System.out.println("last digit is" +mod);
			
			sum=sum+mod;
			n=n/10;
			
		}
		System.out.println("count"+count);
		
	System.out.println("Summation"+sum);
		
		
	}
	
	

}
