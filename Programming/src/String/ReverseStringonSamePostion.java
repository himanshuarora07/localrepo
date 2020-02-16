package String;

public class ReverseStringonSamePostion {
	
	
		static String doReverse(String[] str)
		{
			
			StringBuilder str1=new StringBuilder();
			
			
			for (int i = str.length-1; i >=0; i--) {
				
			str1.append(str[i]+" ");
			
				
			}
			String s=str1.toString();
			return s;
		}
	public static void main(String[] args) {
		
		
		String s1="Swami om Swami Om";
		String[] s2=s1.split(" ");
		String rev=doReverse(s2);
		for (int i = rev.length()-1; i >=0; i--) {
			
			System.out.print(rev.charAt(i));
			
		}
	
		
		
		
	}

}
