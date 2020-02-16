
public class Spynumber {

	public static void main(String[] args) {
		int num=123;
		int copy=num;
		int sum=0;
		int Prod=1;
		while(num>0)
		{
			int x=num%10;
			 sum=sum+x;
			 Prod=Prod*x;
			
			num=num/10;
		}
		if(sum==Prod){
		System.out.println(copy+" is spy number");
		}
		else{
		System.out.println(copy+" is not spy number");
		}
	}
}
