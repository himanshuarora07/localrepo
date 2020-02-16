package String;

public class PalindromString {
	public static void main(String[] args) {
		String str="MALAYALAM";
		char[] arr;
		
		StringBuilder str1=new StringBuilder();
		for (int i = str.length()-1; i >=0; i--) {
			
			str1.append(str.charAt(i));
			
		}
		
		if(str.equals(str1.toString()))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
		
	}

}
