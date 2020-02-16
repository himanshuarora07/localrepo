package String;

public class PalindromStringTwo {
	public static void main(String[] args) {
		String str="MALAYALAM";
		boolean flag=false;
		
		for (int i = 0,j=str.length()-1; i <= str.length()&& j >= 0; i++,j--) {
			
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=true;
				break;
			}
			
		}
		
		if(flag==true)
		{
			System.out.println("String is not palindrom");
		}
		else
		{
			System.out.println("String is palindrom");
		}
		
	}
	
	
	
	

}
