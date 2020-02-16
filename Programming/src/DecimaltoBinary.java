
public class DecimaltoBinary {
public static void main(String[] args) {
	
	int num=13;
	String str="";
	while(num!=0)
	{
		int dig=num%2;
		str=dig+str;
		num=num/2;
	}
	System.out.println(str);
}
}
