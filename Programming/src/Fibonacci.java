
public class Fibonacci {
	public static void main(String[] args) {
		
		
		int a=0;
		int b=1;
		int res=0;
		
		System.out.print("Fibonacci seris is  ");
		System.out.print(a+" ");
		System.out.print(b+" ");
		//for (int i = 0; res < 100 ; i++) {
			
			
			while(res<100)
			{
			res= a+b;
			if(res<100)
			{
			System.out.print(res+" ");
			}
			a=b;
			b=res;
			
			
		}
		
	}

}
