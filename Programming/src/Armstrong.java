
public class Armstrong {
	public static void main(String[] args) {
		int num=1634;
		int temp=num;
		int count=0;
		int sum=0;
		while(num>0)
		{
			count++;
			num=num/10;
			
		}
		while(temp>0)
		{
		int x =temp%10;
		int mul=1;
		for (int i = 1; i <=count; i++) {
		
			mul=mul*x;
			
		}
		
		 sum=sum+mul;
		temp=temp/10;
		}
		System.out.println(sum);
	}

}
