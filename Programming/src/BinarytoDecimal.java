
public class BinarytoDecimal {
	static int power(int digit,int pow){
		
		int power=1;
		for (int i = 1; i <= pow; i++) {
			power=power*digit;
			
		}
		
		
		return power;
	}
	
	public static void main(String[] args) {
		//System.out.println(power(2,4));
		
		int counter=0;
		int num=1101;
		int sum=0;
		while(num!=0)
		{
			int last=num%10;
			sum=sum+power(2,counter)*last;
			counter++;
			num=num/10;
		}
		
		System.out.println(sum);
	}
	
}
