
public class NivenNumber {
	public static void main(String[] args) {
		int num=21;
		int temp=num;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		
		if(temp%sum==0)
		{
			System.out.println(temp + " is niven number");
		}
		else
		{
			System.out.println(temp+" is not even number");
		}
	}

}
