
public class Neonnumber {

	public static void main(String[] args) {
		int num=9;
		int temp=num;
		num=num *num;
		
		int sum=0;
		while(num>0)
		{
			int x=num%10;
			sum= sum+x;
			num=num/10;
			
		}
		if(temp==sum){
		System.out.println(temp +" is neon number");
		}
		else
		{
			System.out.println(temp +" is not neon number");
		}
		
	}
}
