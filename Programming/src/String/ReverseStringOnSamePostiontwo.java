package String;

public class ReverseStringOnSamePostiontwo {
	static String doReverse(String str)
	{
		
		StringBuilder str1=new StringBuilder();
		for (int i = str.length()-1; i >=0; i--) {
			
		str1.append(str.charAt(i));
		
			
		}
		String s=str1.toString();
		return s;
	}
	public static void main(String[] args) {
		
		String s1="Swami om Swami Om";
		String[] arr=s1.split(" ");
		StringBuilder str2=new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			
			String temp=doReverse(arr[i]);
			str2.append(temp+" ");
			
		}
		
		System.out.println(str2);
	}
}
