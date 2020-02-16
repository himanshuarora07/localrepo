
public class Strongnumber {
	public static void main(String[] args) {
		
		int num=145;
		int temp = num;
		int mod;
		
		int sum=0;
		while(num>0)
		{
			mod=num%10;
			int fact=1;
			for (int i = 1; i <=mod; i++) {
				
				fact=fact*i;
				
			}
			sum=sum+fact;
			
			num=num/10;
			
		}
		
		if(temp==sum)
			System.out.println(temp +" is strong number");
		
		else
		{
			System.out.println(temp +"is not strong number");
		}
	}

}
