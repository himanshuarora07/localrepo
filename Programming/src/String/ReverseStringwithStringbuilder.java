package String;

public class ReverseStringwithStringbuilder {
	
	public static void main(String[] args) {
		String str= "mandir wahi bnayenge";
		char[] arr=str.toCharArray();
		StringBuilder str1=new StringBuilder();
		for (int i = arr.length-1; i >=0; i--) {
			
			str1.append(arr[i]);
			
			
			
		}
		System.out.print(str1);
	}

}
