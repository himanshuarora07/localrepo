package String;

public class StringBuilderPrgm {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder();
		str.append("hello there");
		System.out.println(str);
		str.append(" how are you");
		System.out.println(str);
		str.reverse();
//		String s=str.toString();
//		System.out.println(s);
		str.insert(0, "re  ");
		System.out.println(str);
		
//		str.append("1234123412341234");
//		System.out.println(str.capacity());
//		str.append("1234");
//		System.out.println(str.capacity());
//		str.append("1234123412341234");
//		System.out.println(str.capacity());
//		
//		str.append("123412341234123412341234123412341234123412341236412341234123412341234123412341234123412341234123412341234123412341234123412341234");
//		System.out.println(str.capacity()+" and"+ str.length());
//		
//		str.append("1234123412341234123412341235412341234123412341236412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234123412341234");
//		System.out.println(str.capacity()+" and"+ str.length());
	}
}
