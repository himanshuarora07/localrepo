package String;

public class ReverseStringusingMethod {
	static String doReverse(String str)
	{
		StringBuilder str1=new StringBuilder();
		for (int i = str.length()-1; i >=0; i--) {
			
			str1.append(str.charAt(i));
			
		}
		
		String s= str1.toString();
		return s;
	}
public static void main(String[] args) {
	
	String rev=doReverse("Swami Om Swami OM");
	System.out.println(rev);
	
}
}
