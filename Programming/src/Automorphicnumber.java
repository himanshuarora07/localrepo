
public class Automorphicnumber {
public static void main(String[] args) {
	int num=5;
	int sq= num*num;
	
	sq=sq%10;
	
	if(sq==num)
	{
		System.out.println(num+" is Automorphic number");
	}
	else{
		System.out.println(num+" is not Automorphic number");
	}
}
}
