
public class findnumbymethod {

	static boolean check(int num,int digit)
	{
		
		 while(num>0)
		 {
			 
			int last=num%10;
			 if(last==digit)
			 {
			 return true;
			 
			 }
		num=num/10;	
	 
		 }
		
		 return false;
		 
	}
	public static void main(String[] args) {
		System.out.println(check(13345,3));
	}
}
