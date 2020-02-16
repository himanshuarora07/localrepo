
public class Strongnumberbymethod {
	
	static int fact(int digit)
	{
		int fact=1;
		for (int i = 1; i <= digit; i++) {
			fact=fact*i;
			
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		int num=145;
		int copy=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+fact(rem);
			num=num/10;
		}
		
		if(copy==sum){
			System.out.println("Strong number");
		}
		
		else{
			System.out.println("not Strong number");
		}
	}
}
