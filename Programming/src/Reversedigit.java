
public class Reversedigit {

	public static void main(String[] args) {
		int num=257;
		int last=0;
		int rev=0;
		while(num>0)
		{
		last=num%10;
		rev=rev*10+last;
		//System.out.print(last);
		num=num/10;
		}
		
		//num=(num*10)+7;
		System.out.println(rev);
	}
}
